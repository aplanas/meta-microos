SUMMARY = "Style preserving TOML library"
DESCRIPTION = "Style preserving TOML library"
LICENSE = "MIT"

PV = "0.12.1"

RPM_NAME = "python310-tomlkit-0.12.1-1.1.noarch.rpm"
RPM_HASH = "a90bad52e0709a6a50cab3d0528aaa6ec0796b30ade636fa8ae935fcc7b6104880817adf90be485a351eb59c6173802977436d12cf9b0d81bdb8b08a2a6f2053"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-tomlkit \
python310-tomlkit \
python3dist-tomlkit"

RDEPENDS:${PN} += "python-abi"

inherit rpm
