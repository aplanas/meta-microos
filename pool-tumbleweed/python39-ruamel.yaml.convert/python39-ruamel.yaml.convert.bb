SUMMARY = "Data format conversion routines to and from YAML"
DESCRIPTION = "Format conversion routines to and from YAML."
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "python39-ruamel.yaml.convert-0.3.2-1.14.noarch.rpm"
RPM_HASH = "4c8ea445f883949faaa06617198b0974277c653e9a8b4bcd686928cae9d1eed63974c78171bb16311d035e66dc5dc1a7f7dae67c8600de93c4fbea2a8f91c4a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-ruamel.yaml.convert \
python39-ruamel.yaml.convert \
python3dist-ruamel.yaml.convert"

RDEPENDS:${PN} += "python-abi \
python39-python-dateutil \
python39-ruamel.base \
python39-ruamel.yaml"

inherit rpm
