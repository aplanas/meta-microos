SUMMARY = "Advanced Python dictionaries with dot notation access"
DESCRIPTION = "Advanced Python dictionaries with dot notation access"
LICENSE = "MIT"

PV = "6.1.0"

RPM_NAME = "python311-python-box-6.1.0-1.5.noarch.rpm"
RPM_HASH = "535f9492ad3673da743fd18749b85f103096cc34ea5645e521df6bfb75255405d5babab8b9d4df3aade714ab16a6478f84aba7e81ffc4b428622f2338bfa8bfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-box \
python3.11dist-python-box \
python311-python-box \
python3dist-python-box"

RDEPENDS:${PN} += "python-abi \
python311-msgpack \
python311-ruamel.yaml \
python311-toml"

inherit rpm
