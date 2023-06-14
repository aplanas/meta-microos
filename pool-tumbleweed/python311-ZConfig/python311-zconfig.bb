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

RPM_NAME = "python311-ZConfig-3.6.1-1.3.noarch.rpm"
RPM_HASH = "b93dd8791fb3fac0a3d8c511985f9914bc4da909f77e86241b4f53f8b3e14d31e670322ec745f6f869d3f1e4b9f7327e152365afba8f394548741fb7d7da1fc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-zconfig \
python311-ZConfig \
python3dist-zconfig"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-setuptools \
update-alternatives"

inherit rpm
