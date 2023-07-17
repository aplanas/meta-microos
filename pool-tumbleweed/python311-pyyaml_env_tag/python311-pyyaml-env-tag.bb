SUMMARY = "A custom YAML tag for referencing environment variables in YAML files"
DESCRIPTION = "A custom YAML tag for referencing environment variables in YAML files."
LICENSE = "MIT"

PV = "0.1"

RPM_NAME = "python311-pyyaml_env_tag-0.1-3.1.noarch.rpm"
RPM_HASH = "b7167b066591dcf69ccff7920d16990163a9b1f75095acaf8e8149f020c88cbf3a0fb667db2362ecdd2cca911366a3fb00be1916c4973848f2081d5fc3907c2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyyaml-env-tag \
python3.11dist-pyyaml-env-tag \
python311-pyyaml-env-tag \
python3dist-pyyaml-env-tag"

RDEPENDS:${PN} += "python-abi \
python311-PyYAML"

inherit rpm
