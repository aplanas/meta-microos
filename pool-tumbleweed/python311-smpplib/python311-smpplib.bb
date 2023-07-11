SUMMARY = "SMPP library for Python"
DESCRIPTION = "SMPP is the Short Message Peer-to-Peer protocol for conveying SMS \
operations. \
Python-smpplib is a python based SMPP 3.4 client library that \
allows you to send and receive SMS to an SMS gateway or SMSC."
LICENSE = "LGPL-2.0-only"

PV = "2.2.1"

RPM_NAME = "python311-smpplib-2.2.1-2.7.noarch.rpm"
RPM_HASH = "7b8d66754aa3a8936789d942db4255239dcc5a45af76aad1ad247d00cdd9481b97d31011da25ce7599e3b25a1d5ec588295a1fc4ff6d7c53e256c1472dec34a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-smpplib \
python3.11dist-smpplib \
python311-smpplib \
python3dist-smpplib"

RDEPENDS:${PN} += "python-abi \
python311-six"

inherit rpm
