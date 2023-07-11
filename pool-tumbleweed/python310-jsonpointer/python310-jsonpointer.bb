SUMMARY = "Module to identify specific nodes in a JSON document"
DESCRIPTION = "A module to identify specific nodes in a JSON document (according to draft 08)."
LICENSE = "BSD-3-Clause"

PV = "2.3"

RPM_NAME = "python310-jsonpointer-2.3-2.2.noarch.rpm"
RPM_HASH = "f513e026aa4976faed3a4f75c80344441e668394c6d61ac69e44e38484556ebffc48019855331918654f8547f1675b7100e000a084d1c0a23c54fe0c098e6ac2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jsonpointer \
python310-jsonpointer \
python3dist-jsonpointer"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
