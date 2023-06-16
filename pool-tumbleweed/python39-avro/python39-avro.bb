SUMMARY = "A serialization and RPC framework for Python"
DESCRIPTION = "Apache Avro is a serialization and RPC framework. \
This package contains the python implementation of Avro."
LICENSE = "Apache-2.0"

PV = "1.11.1"

RPM_NAME = "python39-avro-1.11.1-2.4.noarch.rpm"
RPM_HASH = "9575a9dd23e7936f1235fd21eb6e63811e052b3749a7236c5d7b1aece3e11ba7e532a0f53e0c1ff9bf33d2673d4e41c6506fa97fd519c8cfcae0043c472a2c82"
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
