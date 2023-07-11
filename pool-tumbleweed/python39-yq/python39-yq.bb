SUMMARY = "Command-line YAML processor - jq wrapper for YAML documents"
DESCRIPTION = "yq: Command-line YAML processor - jq wrapper for YAML documents"
LICENSE = "Apache-2.0"

PV = "3.2.2"

RPM_NAME = "python39-yq-3.2.2-1.3.noarch.rpm"
RPM_HASH = "0f05936e6101f2a303f5ce0657a9b4d63303798cad58e08b61c72b5b76ba97d60b220d917c647f884ccda0a00a5ded31ad7e84b25908e84477e93cb2c9612e70"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-yq \
python39-yq \
python3dist-yq"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
jq \
python-abi \
python39-PyYAML \
python39-argcomplete \
python39-tomlkit \
python39-xmltodict \
update-alternatives"

inherit rpm
