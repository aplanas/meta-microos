SUMMARY = "Data format conversion routines to and from YAML"
DESCRIPTION = "Format conversion routines to and from YAML."
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "python310-ruamel.yaml.convert-0.3.2-1.16.noarch.rpm"
RPM_HASH = "1e2638734c5d951162c3b9a03f205a6a119eccc9927fb69fc711415825bfab76e478e97235d05131d060c5a279e627c197aa4a6f09839a0fcb24b6a108fdd3ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-ruamel.yaml.convert \
python310-ruamel.yaml.convert \
python3dist-ruamel.yaml.convert"

RDEPENDS:${PN} += "python-abi \
python310-python-dateutil \
python310-ruamel.base \
python310-ruamel.yaml"

inherit rpm
