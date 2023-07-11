SUMMARY = "Advanced Python dictionaries with dot notation access"
DESCRIPTION = "Advanced Python dictionaries with dot notation access"
LICENSE = "MIT"

PV = "6.1.0"

RPM_NAME = "python39-python-box-6.1.0-1.5.noarch.rpm"
RPM_HASH = "52bf02c33b1eb9e7ca8a1234560e959dcb901e1ae389ab426e8bf110a7505ab080869eb7e60a42ccbedd59f6aa0edc9a3cfc9cd9625cbafde91e056184477a60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-python-box \
python39-python-box \
python3dist-python-box"

RDEPENDS:${PN} += "python-abi \
python39-msgpack \
python39-ruamel.yaml \
python39-toml"

inherit rpm
