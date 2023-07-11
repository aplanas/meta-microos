SUMMARY = "Kombu actor framework"
DESCRIPTION = "Actor framework for Kombu"
LICENSE = "BSD-2-Clause"

PV = "0.0.3"

RPM_NAME = "python39-cl-0.0.3-16.5.noarch.rpm"
RPM_HASH = "72302a5105c3231b7eec8bcc8ee979cfab3aef3d529774da6eb1742ca634c3a60283994b8f71b875beca49a5b6ad3e8cfff1e13fade84c78780f3dacbc09e947"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cl \
python39-cl \
python3dist-cl"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-kombu \
update-alternatives"

inherit rpm
