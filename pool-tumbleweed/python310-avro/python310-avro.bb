SUMMARY = "A serialization and RPC framework for Python"
DESCRIPTION = "Apache Avro is a serialization and RPC framework. \
This package contains the python implementation of Avro."
LICENSE = "Apache-2.0"

PV = "1.11.1"

RPM_NAME = "python310-avro-1.11.1-2.4.noarch.rpm"
RPM_HASH = "ceb597dbfec12fee4dd39166d9612c2f365bd7e2ec6e61fff059d16dbfb8d9e0e3ca9c825832f8ebccdf82869636f337b756f5a9ab7c9051c9bbd232d1d760c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-avro \
python3.10dist(avro) \
python310-avro \
python3dist(avro)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python(abi) \
python310-Twisted \
python310-zope.interface \
update-alternatives"

inherit rpm
