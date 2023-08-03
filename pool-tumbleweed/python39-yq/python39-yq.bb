SUMMARY = "Command-line YAML processor - jq wrapper for YAML documents"
DESCRIPTION = "yq: Command-line YAML processor - jq wrapper for YAML documents"
LICENSE = "Apache-2.0"

PV = "3.2.2"

RPM_NAME = "python39-yq-3.2.2-2.1.noarch.rpm"
RPM_HASH = "dcf7f08360ed2280ddefaba32602d44f7e3f91e8b2f81380ce3902f50c51348e22313c6c4cf7fb997a03c55d2f70ca113442f12a65939a53d351e28257fb0bdd"
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
