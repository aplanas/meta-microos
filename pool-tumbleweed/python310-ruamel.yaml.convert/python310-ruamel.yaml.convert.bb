SUMMARY = "Data format conversion routines to and from YAML"
DESCRIPTION = "Format conversion routines to and from YAML."
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "python310-ruamel.yaml.convert-0.3.2-1.14.noarch.rpm"
RPM_HASH = "43c260ee36108ae3b99ff831d2fa1b8d621fabd5dc0125a70542c7eb0100508222b3d4d9660f1ed3bd832bce212055f96c69423bcba1f178b3a697358b14ffdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ruamel.yaml.convert \
python3.10dist-ruamel.yaml.convert \
python310-ruamel.yaml.convert \
python3dist-ruamel.yaml.convert"

RDEPENDS:${PN} += "python-abi \
python310-python-dateutil \
python310-ruamel.base \
python310-ruamel.yaml"

inherit rpm
