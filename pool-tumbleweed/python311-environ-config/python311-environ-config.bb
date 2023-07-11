SUMMARY = "Boilerplate-free configuration with env variables"
DESCRIPTION = "Boilerplate-free configuration with env variables."
LICENSE = "MIT"

PV = "23.2.0"

RPM_NAME = "python311-environ-config-23.2.0-1.2.noarch.rpm"
RPM_HASH = "6e616c521202437e7884de5876e9319fcedee3f24af7dc8e4d12b2f6f562bbd952c5a55de38c429ae24ef1706fb1d4dc1e6f8cc29ed32e522bfd2d216b4fc778"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-environ-config \
python3.11dist-environ-config \
python311-environ-config \
python3dist-environ-config"

RDEPENDS:${PN} += "python-abi \
python311-attrs"

inherit rpm
