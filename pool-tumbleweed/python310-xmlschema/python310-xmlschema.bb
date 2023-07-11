SUMMARY = "An XML Schema validator and decoder"
DESCRIPTION = "The *xmlschema* library is an implementation of `XML Schema <http://www.w3.org/2001/XMLSchema>`_ \
for Python."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python310-xmlschema-2.3.0-1.3.noarch.rpm"
RPM_HASH = "40c032ce13e01f388468c6830b47ce9f5c2e5e1d75884659252aa38f000dbcf59c9d08e6d2901d7a7cdb330dd8ff9247ba9c5fab2fa390190651267ebce3cb17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-xmlschema \
python310-xmlschema \
python3dist-xmlschema"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-elementpath \
python310-lxml \
update-alternatives"

inherit rpm
