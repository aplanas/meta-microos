SUMMARY = "Module to identify specific nodes in a JSON document"
DESCRIPTION = "A module to identify specific nodes in a JSON document (according to draft 08)."
LICENSE = "BSD-3-Clause"

PV = "2.3"

RPM_NAME = "python310-jsonpointer-2.3-2.1.noarch.rpm"
RPM_HASH = "0dd2e491f7e3b73db8b9be771e6984e13e86cd3aef6033dc2bb2770aefa47a1cd119030dd6e54393e54f152ef0f2859b546656109bd65e355f3ce43972c0cc76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jsonpointer \
python3.10dist-jsonpointer \
python310-jsonpointer \
python3dist-jsonpointer"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
