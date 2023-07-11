SUMMARY = "Structured Configuration Library"
DESCRIPTION = "ZConfig is a configuration library intended for general use. It supports a \
hierarchical schema-driven configuration model that allows a schema to specify \
data conversion routines written in Python. ZConfig's model is very different \
from the model supported by the ConfigParser module found in Python's standard \
library, and is more suitable to configuration-intensive applications. \
 \
ZConfig schema are written in an XML-based language and are able to 'import' \
schema components provided by Python packages. Since components are able to \
bind to conversion functions provided by Python code in the package (or \
elsewhere), configuration objects can be arbitrarily complex, with values that \
have been verified against arbitrary constraints. This makes it easy for \
applications to separate configuration support from configuration loading even \
with configuration data being defined and consumed by a wide range of separate \
packages."
LICENSE = "ZPL-2.1"

PV = "3.6.1"

RPM_NAME = "python39-ZConfig-3.6.1-1.5.noarch.rpm"
RPM_HASH = "6b74ee4b7e51d9d90675fabb8805ce5659471eb46e28d96bc658d4974327ecb30f552bc415189c4c548a9308f37df64976ec5958c233544624959ac9d406e307"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-zconfig \
python39-ZConfig \
python3dist-zconfig"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-setuptools \
update-alternatives"

inherit rpm
