SUMMARY = "Command-line YAML processor - jq wrapper for YAML documents"
DESCRIPTION = "yq: Command-line YAML processor - jq wrapper for YAML documents"
LICENSE = "Apache-2.0"

PV = "3.2.2"

RPM_NAME = "python311-yq-3.2.2-1.3.noarch.rpm"
RPM_HASH = "93469586a705eb48a15bdc0b3d13b946e0761f2f02187f295cb14c577fcc65cf4f1442c26f29b41cd35f683eb85c6545c8630124253531c60d29eafbe6fa8a3b"
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
