SUMMARY = "A custom YAML tag for referencing environment variables in YAML files"
DESCRIPTION = "A custom YAML tag for referencing environment variables in YAML files."
LICENSE = "MIT"

PV = "0.1"

RPM_NAME = "python311-pyyaml_env_tag-0.1-2.16.noarch.rpm"
RPM_HASH = "f4dba8d573e7e2342abba6e600f888f56d06676f2633baf68df3705eb06532ae522fdcb323797414a82c2f98d1c9b65b5cec3810f97b6a1b69259990949376d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyyaml-env-tag \
python3.11dist-pyyaml-env-tag \
python311-pyyaml-env-tag \
python3dist-pyyaml-env-tag"

RDEPENDS:${PN} += "python-abi \
python311-PyYAML"

inherit rpm
