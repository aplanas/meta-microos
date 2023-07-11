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

RPM_NAME = "python310-ZConfig-3.6.1-1.5.noarch.rpm"
RPM_HASH = "cdcb549ddd4ae4ad4095bbe80cea0391df89ae18104065e3c463803e0c804b602ea87834c2c0c3a270045f6e7d41156f008c225c3db85dce933abee26dc0b98e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-zconfig \
python310-ZConfig \
python3dist-zconfig"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-setuptools \
update-alternatives"

inherit rpm
