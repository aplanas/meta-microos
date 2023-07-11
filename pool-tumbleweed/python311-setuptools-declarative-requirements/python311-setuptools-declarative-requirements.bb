SUMMARY = "File support for setuptools declarative setup.cfg"
DESCRIPTION = "File support for setuptools declarative setup.cfg."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "python311-setuptools-declarative-requirements-1.2.0-2.3.noarch.rpm"
RPM_HASH = "34e8bb750eed77f2ba51d8982001cb516a4f3f4c7dc98eedbe72c39960854ce2fa41f2c211456ff1e59d3679141c95fbee6d9cac4d1196d144d861c81f6b6435"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-setuptools-declarative-requirements \
python3.11dist-setuptools-declarative-requirements \
python311-setuptools-declarative-requirements \
python3dist-setuptools-declarative-requirements"

RDEPENDS:${PN} += "python-abi \
python311-setuptools \
python311-toml \
python311-wheel"

inherit rpm
