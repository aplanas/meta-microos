SUMMARY = "A Working Python AST"
DESCRIPTION = "A Working Python AST."
LICENSE = "Python-2.0 & MIT"

PV = "0.19.1.0"

RPM_NAME = "python311-awpa-0.19.1.0-1.20.noarch.rpm"
RPM_HASH = "cd42667701c146215638d7701d84da87c17ae9606c3a5e46694240a4aa026d696318593f37efc8d0edc325597c8a6f4c96a231ebd4fe16d4204e4466e2cde453"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-awpa \
python3.11dist-awpa \
python311-awpa \
python3dist-awpa"

RDEPENDS:${PN} += "python-abi"

inherit rpm
