SUMMARY = "Command-line YAML processor - jq wrapper for YAML documents"
DESCRIPTION = "yq: Command-line YAML processor - jq wrapper for YAML documents"
LICENSE = "Apache-2.0"

PV = "3.2.2"

RPM_NAME = "python310-yq-3.2.2-2.1.noarch.rpm"
RPM_HASH = "cb4fb8a3dce6dbed22e627f41e1c91b4351a125474056d6be9d5d7819a59f96c44dc061ab8078e680eaa8fe808fdbdebe678f0dae7ba02e9eadd44d5656b62c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-yq \
python310-yq \
python3dist-yq"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
jq \
python-abi \
python310-PyYAML \
python310-argcomplete \
python310-tomlkit \
python310-xmltodict \
update-alternatives"

inherit rpm
