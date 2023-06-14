SUMMARY = "Style preserving TOML library"
DESCRIPTION = "Style preserving TOML library"
LICENSE = "MIT"

PV = "0.11.8"

RPM_NAME = "python39-tomlkit-0.11.8-1.1.noarch.rpm"
RPM_HASH = "a5840df13e28c269f279f7fc03713f82a546197a87a4165dffc6212d38e75a7ce413db22a8a4595d6f17bf9c4ca661e3adae84e8281ae98f1419e1a5d35cf63a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-tomlkit \
python39-tomlkit \
python3dist-tomlkit"

RDEPENDS:${PN} += "python-abi"

inherit rpm
