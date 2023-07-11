SUMMARY = "A serialization and RPC framework for Python"
DESCRIPTION = "Apache Avro is a serialization and RPC framework. \
This package contains the python implementation of Avro."
LICENSE = "Apache-2.0"

PV = "1.11.1"

RPM_NAME = "python310-avro-1.11.1-2.6.noarch.rpm"
RPM_HASH = "c5c37b73f37f577074132414fdf54a493820d0f3732588bc2034c06a12e06025dfadc4a1c4ff8f13100eb8c30c6aa4b11d93cf4bd8776131e956bbbf8f4fa1e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-avro \
python310-avro \
python3dist-avro"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-Twisted \
python310-zope.interface \
update-alternatives"

inherit rpm
