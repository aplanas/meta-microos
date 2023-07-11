SUMMARY = "A custom YAML tag for referencing environment variables in YAML files"
DESCRIPTION = "A custom YAML tag for referencing environment variables in YAML files."
LICENSE = "MIT"

PV = "0.1"

RPM_NAME = "python310-pyyaml_env_tag-0.1-2.16.noarch.rpm"
RPM_HASH = "07542a7c2a67fd44bb51c89e20dfe742982c9897bc364c16c6fd0b3ac1ba0198e9781361c7b64b7f0df02cb43b7941fddd550145675d74133a0bfa68306e988f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyyaml-env-tag \
python310-pyyaml-env-tag \
python3dist-pyyaml-env-tag"

RDEPENDS:${PN} += "python-abi \
python310-PyYAML"

inherit rpm
