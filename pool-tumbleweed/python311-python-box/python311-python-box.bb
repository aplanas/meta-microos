SUMMARY = "Advanced Python dictionaries with dot notation access"
DESCRIPTION = "Advanced Python dictionaries with dot notation access"
LICENSE = "MIT"

PV = "6.1.0"

RPM_NAME = "python311-python-box-6.1.0-1.3.noarch.rpm"
RPM_HASH = "25ca979307973614baddf1d8efe2d7a555c913d5e677541a50b8ad35caa85a4f6109afc110b1529ce586d9fdaeebbb19db1b0a0a04d5f48d54db938ad41c9e99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-python-box \
python311-python-box \
python3dist-python-box"

RDEPENDS:${PN} += "python-abi \
python311-msgpack \
python311-ruamel.yaml \
python311-toml"

inherit rpm
