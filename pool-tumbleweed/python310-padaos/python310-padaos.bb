SUMMARY = "An intent parser"
DESCRIPTION = "A intent parser Python module. \
 \
Padaos converts a series of example sentences into one big chunk of \
regex. Each intent is a single compiled regex matcher."
LICENSE = "MIT"

PV = "0.1.10"

RPM_NAME = "python310-padaos-0.1.10-1.21.noarch.rpm"
RPM_HASH = "3eca189675e52c4c5af36149f32ad89533809fda66899f87a8e09fb512ddc89ee8b0c6fef98948b06b2b0b81eb9601029cd801e04f4e6175ef69ca6a9993ebcf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-padaos \
python310-padaos \
python3dist-padaos"

RDEPENDS:${PN} += "python-abi"

inherit rpm
