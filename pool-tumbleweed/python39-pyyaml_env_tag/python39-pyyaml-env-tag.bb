SUMMARY = "A custom YAML tag for referencing environment variables in YAML files"
DESCRIPTION = "A custom YAML tag for referencing environment variables in YAML files."
LICENSE = "MIT"

PV = "0.1"

RPM_NAME = "python39-pyyaml_env_tag-0.1-3.1.noarch.rpm"
RPM_HASH = "7f4534904939dbd2dc300b483684cfa28e84d0e9fbccf901939ef428fface951831124c5704e721be4c4fe7554025e0fff4123c5318c0b26f31ba05375f256ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyyaml-env-tag \
python39-pyyaml-env-tag \
python3dist-pyyaml-env-tag"

RDEPENDS:${PN} += "python-abi \
python39-PyYAML"

inherit rpm
