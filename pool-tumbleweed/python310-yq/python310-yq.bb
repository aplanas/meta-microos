SUMMARY = "Command-line YAML processor - jq wrapper for YAML documents"
DESCRIPTION = "yq: Command-line YAML processor - jq wrapper for YAML documents"
LICENSE = "Apache-2.0"

PV = "3.2.2"

RPM_NAME = "python310-yq-3.2.2-1.3.noarch.rpm"
RPM_HASH = "4f146083476cd89c2e7c9c5f2d67a0780111fca3732d2c5f6b039f864ed7401733dfd818bc37570af11d97fd2c7226bc1f5fef332af4be429ca179dd163a01e5"
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
