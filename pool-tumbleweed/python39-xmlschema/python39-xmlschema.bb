SUMMARY = "An XML Schema validator and decoder"
DESCRIPTION = "The *xmlschema* library is an implementation of `XML Schema <http://www.w3.org/2001/XMLSchema>`_ \
for Python."
LICENSE = "MIT"

PV = "2.3.0"

RPM_NAME = "python39-xmlschema-2.3.0-1.3.noarch.rpm"
RPM_HASH = "17d03b3ceb69674f85b238c74b1ad691033b294276ac936e244af92ee8164fb3d284b1a4a35b08cb49faffe1a6f747ad1ff6364f0f3439e020f501b2d36dde6a"
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
