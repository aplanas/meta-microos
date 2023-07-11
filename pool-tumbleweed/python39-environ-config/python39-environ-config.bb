SUMMARY = "Boilerplate-free configuration with env variables"
DESCRIPTION = "Boilerplate-free configuration with env variables."
LICENSE = "MIT"

PV = "23.2.0"

RPM_NAME = "python39-environ-config-23.2.0-1.2.noarch.rpm"
RPM_HASH = "69166192afd5d268409abba9b81a770f28e9e4c2dc9106b470cb0264dd5647a36bb707707b06c5e978b7a3516e8d860cee8c6995f33c2280d809c78d4ac13c62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-environ-config \
python39-environ-config \
python3dist-environ-config"

RDEPENDS:${PN} += "python-abi \
python39-attrs"

inherit rpm
