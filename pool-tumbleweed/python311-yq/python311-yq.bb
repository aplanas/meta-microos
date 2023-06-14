SUMMARY = "Command-line YAML processor - jq wrapper for YAML documents"
DESCRIPTION = "yq: Command-line YAML processor - jq wrapper for YAML documents"
LICENSE = "Apache-2.0"

PV = "3.2.2"

RPM_NAME = "python311-yq-3.2.2-1.1.noarch.rpm"
RPM_HASH = "7e113dafbc4a2834cc5eb81081eb8f054072f16a07986c55d22111def56864647f13b4544f0871b56514f3561d8bbcd75d34399f5390c9844182de461eb8ec19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-yq \
python311-yq \
python3dist-yq"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
jq \
python-abi \
python311-PyYAML \
python311-argcomplete \
python311-tomlkit \
python311-xmltodict \
update-alternatives"

inherit rpm
