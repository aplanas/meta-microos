SUMMARY = "Covariance Matrix Adaptation Evolution Strategy numerical optimizer"
DESCRIPTION = "A stochastic numerical optimization algorithm for difficult \
(non-convex, ill-conditioned, multi-modal, rugged, noisy) optimization \
problems in continuous search spaces, implemented in Python."
LICENSE = "BSD-3-Clause"

PV = "3.3.0"

RPM_NAME = "python310-cma-3.3.0-1.3.noarch.rpm"
RPM_HASH = "b0f53fd65a084cbad848e618ae88865b4dc87133634087bf0ecf3dcabbe524e950ea725afe1a33e640eee0b0e9ff81e552c457ad02f5d557501b5fb651a01a63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cma \
python3.10dist-cma \
python310-cma \
python3dist-cma"

RDEPENDS:${PN} += "python-abi \
python310-numpy"

inherit rpm
