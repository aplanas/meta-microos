SUMMARY = "Style preserving TOML library"
DESCRIPTION = "Style preserving TOML library"
LICENSE = "MIT"

PV = "0.11.8"

RPM_NAME = "python311-tomlkit-0.11.8-1.3.noarch.rpm"
RPM_HASH = "46b201ca808356413445314954c9408db7362257308ab0279c5901534d728d15d0c8ca0cebe0e154b1401b14b59822eadc4e9905083020308e890868c0d978ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tomlkit \
python3.11dist-tomlkit \
python311-tomlkit \
python3dist-tomlkit"

RDEPENDS:${PN} += "python-abi"

inherit rpm
