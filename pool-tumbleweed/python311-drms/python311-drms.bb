SUMMARY = "Tool to access HMI, AIA and MDI data with Python"
DESCRIPTION = "The drms module provides an interface for accessing HMI, AIA and MDI \
data with Python. It uses the publicly accessible JSOC DRMS server by \
default, but can also be used with local NetDRMS sites."
LICENSE = "MIT"

PV = "0.6.2"

RPM_NAME = "python311-drms-0.6.2-1.10.noarch.rpm"
RPM_HASH = "275fb45e7038978ecdd3a42a5b319782dd06c22bcbb8d4553f9e2342948d8eaf3115f33575fdcb1ced469d3f88da905f9e483fbb96b75ba3c9762b5f1b4df521"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-drms \
python311-drms \
python3dist-drms"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-numpy \
python311-pandas \
update-alternatives"

inherit rpm
