SUMMARY = "Tool to access HMI, AIA and MDI data with Python"
DESCRIPTION = "The drms module provides an interface for accessing HMI, AIA and MDI \
data with Python. It uses the publicly accessible JSOC DRMS server by \
default, but can also be used with local NetDRMS sites."
LICENSE = "MIT"

PV = "0.6.4"

RPM_NAME = "python311-drms-0.6.4-1.1.noarch.rpm"
RPM_HASH = "1b91e36c9d4d0d335b3a86622cfe4c0fbd086026a4df4d91a489361179b95a446b8dcbf8fe9dde79c74a99d3be5cc7086198bf9575846a88106e3986f0c5639b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-drms \
python3.11dist-drms \
python311-drms \
python3dist-drms"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-numpy \
python311-pandas \
update-alternatives"

inherit rpm
