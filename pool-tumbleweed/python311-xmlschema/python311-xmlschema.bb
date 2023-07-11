SUMMARY = "An XML Schema validator and decoder"
DESCRIPTION = "The *xmlschema* library is an implementation of `XML Schema <http://www.w3.org/2001/XMLSchema>`_ \
for Python."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python311-xmlschema-2.3.0-1.3.noarch.rpm"
RPM_HASH = "7075a9c84d7779b3112b8d2c3c68518cf962d5135316f8d347c11bb8f0f999bed448b006f65d9f54e3f6a53d0bd212922f1d9524d187942954ec73b0759a1a3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-xmlschema \
python3.11dist-xmlschema \
python311-xmlschema \
python3dist-xmlschema"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-elementpath \
python311-lxml \
update-alternatives"

inherit rpm
