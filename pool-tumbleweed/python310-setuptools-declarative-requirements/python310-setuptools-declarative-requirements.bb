SUMMARY = "File support for setuptools declarative setup.cfg"
DESCRIPTION = "File support for setuptools declarative setup.cfg."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "python310-setuptools-declarative-requirements-1.2.0-2.3.noarch.rpm"
RPM_HASH = "9e6c94ed26b092f4f79a86687eedc471ec2281cb46b668ea6f43d6f502d1163244ca0bf6a3c87cf5e746ac76b9fb0ba718b729816332401ad4d3403cb23b52bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-setuptools-declarative-requirements \
python310-setuptools-declarative-requirements \
python3dist-setuptools-declarative-requirements"

RDEPENDS:${PN} += "python-abi \
python310-setuptools \
python310-toml \
python310-wheel"

inherit rpm
