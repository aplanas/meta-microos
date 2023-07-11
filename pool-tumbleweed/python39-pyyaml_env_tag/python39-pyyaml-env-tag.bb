SUMMARY = "A custom YAML tag for referencing environment variables in YAML files"
DESCRIPTION = "A custom YAML tag for referencing environment variables in YAML files."
LICENSE = "MIT"

PV = "0.1"

RPM_NAME = "python39-pyyaml_env_tag-0.1-2.16.noarch.rpm"
RPM_HASH = "ce8afd59eff4c0b3beb25c27720fef4af30cc852a88bb3553ec7a49a799ee5cc1c5c98a49f73afa854b5ad25d2ff140a2609744ac780bf5bdb4ea2725019bb97"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pyyaml-env-tag \
python39-pyyaml-env-tag \
python3dist-pyyaml-env-tag"

RDEPENDS:${PN} += "python-abi \
python39-PyYAML"

inherit rpm
