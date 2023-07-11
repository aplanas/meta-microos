SUMMARY = "TransIP API Connector"
DESCRIPTION = "This library implements part of the TransIP API in Python."
LICENSE = "MIT"

PV = "2.1.2"

RPM_NAME = "python310-transip-2.1.2-4.8.noarch.rpm"
RPM_HASH = "2300ebbf69fc3c9e8bde1c1a7197b06c2bf84ea7a902c16cdbde7f0d8922e91827cc94d885bd160347ad32f581f81913204e3ed7f754a73a9e753d971c18558d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-transip \
python310-transip \
python3dist-transip"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-cryptography \
python310-requests \
python310-setuptools \
python310-suds \
update-alternatives"

inherit rpm
