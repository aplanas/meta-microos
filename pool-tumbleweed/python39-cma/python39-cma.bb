SUMMARY = "Covariance Matrix Adaptation Evolution Strategy numerical optimizer"
DESCRIPTION = "A stochastic numerical optimization algorithm for difficult \
(non-convex, ill-conditioned, multi-modal, rugged, noisy) optimization \
problems in continuous search spaces, implemented in Python."
LICENSE = "BSD-3-Clause"

PV = "3.3.0"

RPM_NAME = "python39-cma-3.3.0-1.3.noarch.rpm"
RPM_HASH = "2aa4f6b4d8116094aca12a2dc408b418d8d129b3ad28891a63d25e79fe0f1685eacb5c3a37d77383d1a8ff0484af5d2acf1a827a1b9145c6a77af72b4e4866d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(cma) \
python39-cma \
python3dist(cma)"
RDEPENDS:${PN} += "python(abi) \
python39-numpy"

inherit rpm
