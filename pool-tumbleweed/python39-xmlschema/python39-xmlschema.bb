SUMMARY = "An XML Schema validator and decoder"
DESCRIPTION = "The *xmlschema* library is an implementation of `XML Schema <http://www.w3.org/2001/XMLSchema>`_ \
for Python."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python39-xmlschema-2.3.0-1.1.noarch.rpm"
RPM_HASH = "cb5cfb3315ef4f468e182337a0b2905614c85566610a2c979a114ba14e65752b28eb4a4ef04aad7695bcbcf7ec09286b4135479f4a57798e37f7671486c284a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-xmlschema \
python39-xmlschema \
python3dist-xmlschema"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-elementpath \
python39-lxml \
update-alternatives"

inherit rpm
