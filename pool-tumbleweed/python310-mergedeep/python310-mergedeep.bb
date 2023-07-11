SUMMARY = "A deep merge function for Python"
DESCRIPTION = "A deep merge function for Python."
LICENSE = "MIT"

PV = "1.3.4"

RPM_NAME = "python310-mergedeep-1.3.4-2.9.noarch.rpm"
RPM_HASH = "472df531702b1e2252a6114a31e0ddd0c93ea2f103a2ef50b9ae89ce90c1b972e61ee6e0c81d4d942eb012f9130a2d76a9d2dd3aaa4931959e414969c7946be9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-mergedeep \
python310-mergedeep \
python3dist-mergedeep"

RDEPENDS:${PN} += "python-abi"

inherit rpm
