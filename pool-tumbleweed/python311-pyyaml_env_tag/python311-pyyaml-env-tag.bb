SUMMARY = "A custom YAML tag for referencing environment variables in YAML files"
DESCRIPTION = "A custom YAML tag for referencing environment variables in YAML files."
LICENSE = "MIT"

PV = "0.1"

RPM_NAME = "python311-pyyaml_env_tag-0.1-2.14.noarch.rpm"
RPM_HASH = "0962cd89cc2332e6e5ac32c90728168af76d0388f61ec172a9b76339e73bed8b0e9ddf03af1d868b63be9083399f6f8858cb3bd4394f2d251adccb0969241cba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pyyaml-env-tag) \
python311-pyyaml_env_tag \
python3dist(pyyaml-env-tag)"

RDEPENDS:${PN} += "python(abi) \
python311-PyYAML"

inherit rpm
