SUMMARY = "An intent parser"
DESCRIPTION = "A intent parser Python module. \
 \
Padaos converts a series of example sentences into one big chunk of \
regex. Each intent is a single compiled regex matcher."
LICENSE = "MIT"

PV = "0.1.10"

RPM_NAME = "python311-padaos-0.1.10-1.21.noarch.rpm"
RPM_HASH = "a53630dd682ec1dc028688db0def959f34e77e51957366df46fd1e1a74e1470d2b8e49cf17b47c94ab6b80cd0e51e32758022ee721816278654684d53313b1d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-padaos \
python3.11dist-padaos \
python311-padaos \
python3dist-padaos"

RDEPENDS:${PN} += "python-abi"

inherit rpm
