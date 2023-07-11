SUMMARY = "Python tool configuration"
DESCRIPTION = "Python Tool Configuration \
 \
The goal of this project is to manage configuration for python tools, \
such as black and rope and add support for a pyproject.toml configuration file."
LICENSE = "LGPL-3.0-or-later"

PV = "1.2.4"

RPM_NAME = "python310-pytoolconfig-1.2.4-1.6.noarch.rpm"
RPM_HASH = "c8e9878d17a88f5fba58e60048b169c98c13ffd1a4c874f1a54b8982256f88e46a202943dd7f7c52ca89b92a5efe045406feca1e113af146ce640982b1d08282"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytoolconfig \
python310-pytoolconfig \
python3dist-pytoolconfig"

RDEPENDS:${PN} += "python-abi \
python310-packaging \
python310-tomli"

inherit rpm
