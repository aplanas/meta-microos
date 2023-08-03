SUMMARY = "Digital Forensics Artifact Repository Validator"
DESCRIPTION = "Python modules and program to validate the artifact data. It is \
possible for programs to directly call these Python modules, but, by \
design, said programs should work directly with the YAML files \
themselves and not use these Python modules."
LICENSE = "Apache-2.0"

PV = "20221219"

RPM_NAME = "artifacts-validator-20221219-2.1.noarch.rpm"
RPM_HASH = "dc86397db392a9245ca6a151316659a36a832e909cf11f78eb2e6159df06bdee2ebcb73e6dd2d5256e5e7c8d3e5cb85d59f757cfcdd667dfe815cfb55220e7ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "artifacts-validator \
python3.11dist-artifacts \
python3dist-artifacts"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
artifacts \
python-abi"

inherit rpm
