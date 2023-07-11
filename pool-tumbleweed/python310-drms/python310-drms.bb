SUMMARY = "Tool to access HMI, AIA and MDI data with Python"
DESCRIPTION = "The drms module provides an interface for accessing HMI, AIA and MDI \
data with Python. It uses the publicly accessible JSOC DRMS server by \
default, but can also be used with local NetDRMS sites."
LICENSE = "MIT"

PV = "0.6.4"

RPM_NAME = "python310-drms-0.6.4-1.1.noarch.rpm"
RPM_HASH = "1e5d664c3e2ab1f08fb6a97ee8fbc6dd703e9b6bcb5bef81cc9854255f539c53308f95d219dae38d262dafed907e8788b95cf5409c4ea54d9fa29ceafdb1be30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-drms \
python310-drms \
python3dist-drms"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-numpy \
python310-pandas \
update-alternatives"

inherit rpm
