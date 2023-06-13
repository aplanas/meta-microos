SUMMARY = "A serialization and RPC framework for Python"
DESCRIPTION = "Apache Avro is a serialization and RPC framework. \
This package contains the python implementation of Avro."
LICENSE = "Apache-2.0"

PV = "1.11.1"

RPM_NAME = "python311-avro-1.11.1-2.4.noarch.rpm"
RPM_HASH = "b22e9501703ae11437721aa9e594428957689563100ed8a4f4559ababc5fb6a35f6c7f68d0d6f51340610fb64822eec37e70f0260e9277902b1b961b7297d414"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(avro) \
python311-avro \
python3dist(avro)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python(abi) \
python311-Twisted \
python311-zope.interface \
update-alternatives"

inherit rpm
