SUMMARY = "File support for setuptools declarative setup.cfg"
DESCRIPTION = "File support for setuptools declarative setup.cfg."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "python39-setuptools-declarative-requirements-1.2.0-2.1.noarch.rpm"
RPM_HASH = "498bcf09432e93621ecb6effa4bf6813849c0b75d4d51aea18339a79237b21a8ca70e932ac530e73add06afed815f320f43e03909eaf4215d2c1f68e0565fdd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-setuptools-declarative-requirements \
python39-setuptools-declarative-requirements \
python3dist-setuptools-declarative-requirements"

RDEPENDS:${PN} += "python-abi \
python39-setuptools \
python39-toml \
python39-wheel"

inherit rpm
