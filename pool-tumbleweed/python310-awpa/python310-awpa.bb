SUMMARY = "A Working Python AST"
DESCRIPTION = "A Working Python AST."
LICENSE = "Python-2.0 & MIT"

PV = "0.19.1.0"

RPM_NAME = "python310-awpa-0.19.1.0-1.18.noarch.rpm"
RPM_HASH = "6a65aaef1036f2f739c3cbf4c3e0b042f5f59546a073b00c01ee6e335679c47caa31c1b83a1103444d178bbddf748c4955a86da6e4a2fac529f6d220b97061c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-awpa \
python3.10dist-awpa \
python310-awpa \
python3dist-awpa"

RDEPENDS:${PN} += "python-abi"

inherit rpm
