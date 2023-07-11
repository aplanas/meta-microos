SUMMARY = "A serialization and RPC framework for Python"
DESCRIPTION = "Apache Avro is a serialization and RPC framework. \
This package contains the python implementation of Avro."
LICENSE = "Apache-2.0"

PV = "1.11.1"

RPM_NAME = "python311-avro-1.11.1-2.6.noarch.rpm"
RPM_HASH = "82f504acbaaf882893c93f38eecdc1a36d5284744db77f008e2d8f0ecf7a2f129032abe0d10e074d801ba5bcbb8c16cc03ec510d8e2426bf9c25ff8e8b0b732b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-avro \
python3.11dist-avro \
python311-avro \
python3dist-avro"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Twisted \
python311-zope.interface \
update-alternatives"

inherit rpm
