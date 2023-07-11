SUMMARY = "A serialization and RPC framework for Python"
DESCRIPTION = "Apache Avro is a serialization and RPC framework. \
This package contains the python implementation of Avro."
LICENSE = "Apache-2.0"

PV = "1.11.1"

RPM_NAME = "python39-avro-1.11.1-2.6.noarch.rpm"
RPM_HASH = "f14640049d52c646c6d7ed33dcfde1cfa3c826fda5e365c28926875cd3ac7d0331c3bb9c0e7294daba2b8ef705acc82d1f3f33c5059e8f1863457f2f06fe1546"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-avro \
python39-avro \
python3dist-avro"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Twisted \
python39-zope.interface \
update-alternatives"

inherit rpm
