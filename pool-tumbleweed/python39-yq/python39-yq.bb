SUMMARY = "Command-line YAML processor - jq wrapper for YAML documents"
DESCRIPTION = "yq: Command-line YAML processor - jq wrapper for YAML documents"
LICENSE = "Apache-2.0"

PV = "3.2.2"

RPM_NAME = "python39-yq-3.2.2-1.1.noarch.rpm"
RPM_HASH = "61a6cb5be545ef402bba465133755d84ec7540aa8419bd2004daa6afa049889e74f24654a9c3d24334856ded420d25430f421eb39fdd304d6d6a0bb30de169b8"
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
