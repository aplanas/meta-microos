SUMMARY = "Black format checking plugin for pytest"
DESCRIPTION = "A pytest plugin to enable format checking with black."
LICENSE = "MIT"

PV = "0.3.12"

RPM_NAME = "python311-pytest-black-0.3.12-2.10.noarch.rpm"
RPM_HASH = "a1b1b2fb0b10e7280edb49fa87435d0c88b42bb0d647264d40eb9a8d0361f970ecd4fbf74ec8d51c816e0f83d76329420695de7ece350bbaaff451bc1bbacb3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pytest-black) \
python311-pytest-black \
python3dist(pytest-black)"
RDEPENDS:${PN} += "python(abi) \
python311-black \
python311-pytest \
python311-toml"

inherit rpm
