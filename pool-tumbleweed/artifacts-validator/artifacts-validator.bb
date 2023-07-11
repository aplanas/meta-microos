SUMMARY = "Digital Forensics Artifact Repository Validator"
DESCRIPTION = "Python modules and program to validate the artifact data. It is \
possible for programs to directly call these Python modules, but, by \
design, said programs should work directly with the YAML files \
themselves and not use these Python modules."
LICENSE = "Apache-2.0"

PV = "20220429"

RPM_NAME = "artifacts-validator-20220429-3.2.noarch.rpm"
RPM_HASH = "9f163a54552a92f5074e6edb1769e283e9ce91311284cd978b530c3ee3ff1d76cb1c8cee6e92352fb76d273333ce8db30a8e6c05d4de4c0c3251bd9eb766e88a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "artifacts-validator \
python3.11dist-artifacts \
python3dist-artifacts"

RDEPENDS:${PN} += "/usr/bin/python3 \
artifacts \
python-abi"

inherit rpm
