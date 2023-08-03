SUMMARY = "Command-line YAML processor - jq wrapper for YAML documents"
DESCRIPTION = "yq: Command-line YAML processor - jq wrapper for YAML documents"
LICENSE = "Apache-2.0"

PV = "3.2.2"

RPM_NAME = "python311-yq-3.2.2-2.1.noarch.rpm"
RPM_HASH = "eccd1b45478fb4cacdf302c64d236ed5bc9c4e8590a425095f61a09bc116c40dc8b5b42e34b4bfc3d5e18cd1a2f3d292161f453612c2778ae56acd7c980fc947"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-yq \
python3.11dist-yq \
python311-yq \
python3dist-yq"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
jq \
python-abi \
python311-PyYAML \
python311-argcomplete \
python311-tomlkit \
python311-xmltodict \
update-alternatives"

inherit rpm
