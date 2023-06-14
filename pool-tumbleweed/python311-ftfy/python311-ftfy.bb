SUMMARY = "Python module for repairing mis-decoded Unicode text"
DESCRIPTION = "Ftfy attempts to repair Unicode text that has been erroneously \
put through an encode/decode cycle with different encodings."
LICENSE = "MIT"

PV = "6.0.3"

RPM_NAME = "python311-ftfy-6.0.3-1.7.noarch.rpm"
RPM_HASH = "a9abc65595bc30260575b4e81a0bf4cee430d9b343a0d1a4e9e58cab63d56b2269a1375e2f7c0af513df659ff65facbf00d545e7b9007b3571835a332205f030"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-ftfy \
python311-ftfy \
python3dist-ftfy"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-wcwidth \
update-alternatives"

inherit rpm
