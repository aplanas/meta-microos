SUMMARY = "Command-line YAML processor - jq wrapper for YAML documents"
DESCRIPTION = "yq: Command-line YAML processor - jq wrapper for YAML documents"
LICENSE = "Apache-2.0"

PV = "3.2.2"

RPM_NAME = "python310-yq-3.2.2-1.1.noarch.rpm"
RPM_HASH = "07b9e21f16396e95e46f3a434ecf9640f1723449a8c4b4fa4e389ca9369ead86cf8069fdde0c302242e047c511ac31c015db7f0b44bcc05ed223f0d75a79fe2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-yq \
python3.10dist-yq \
python310-yq \
python3dist-yq"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
jq \
python-abi \
python310-PyYAML \
python310-argcomplete \
python310-tomlkit \
python310-xmltodict \
update-alternatives"

inherit rpm
