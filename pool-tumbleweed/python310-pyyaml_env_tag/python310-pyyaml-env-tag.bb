SUMMARY = "A custom YAML tag for referencing environment variables in YAML files"
DESCRIPTION = "A custom YAML tag for referencing environment variables in YAML files."
LICENSE = "MIT"

PV = "0.1"

RPM_NAME = "python310-pyyaml_env_tag-0.1-3.1.noarch.rpm"
RPM_HASH = "0f6e586f0a43a48acfcbf25e84ec2c645776c34a95a16253505c01dd29e1d8ec0fa7fb9b4f424ba10c0a7a36f420a89f930fd9d36385aaa7df0b8ece4f34c987"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyyaml-env-tag \
python310-pyyaml-env-tag \
python3dist-pyyaml-env-tag"

RDEPENDS:${PN} += "python-abi \
python310-PyYAML"

inherit rpm
