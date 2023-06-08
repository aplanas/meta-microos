SUMMARY = "Digital Forensics Artifact Repository Validator"
DESCRIPTION = "Python modules and program to validate the artifact data. It is \
possible for programs to directly call these Python modules, but, by \
design, said programs should work directly with the YAML files \
themselves and not use these Python modules."
LICENSE = "Apache-2.0"

PV = "20220429"

RPM_NAME = "artifacts-validator-20220429-3.1.noarch.rpm"
RPM_HASH = "8528563fa082930db36d6751e817c7c2a75687d9e5309a692c107a1e2a7e93da292901e3fe868c9076c366db332086ef2097da2cc9fa6009d22fedd4f37ee92c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "artifacts-validator python3.10dist(artifacts) python3dist(artifacts)"
RDEPENDS:${PN} += "/usr/bin/python3 artifacts python(abi)"

inherit rpm
