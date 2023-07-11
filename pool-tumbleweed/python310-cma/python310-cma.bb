SUMMARY = "Covariance Matrix Adaptation Evolution Strategy numerical optimizer"
DESCRIPTION = "A stochastic numerical optimization algorithm for difficult \
(non-convex, ill-conditioned, multi-modal, rugged, noisy) optimization \
problems in continuous search spaces, implemented in Python."
LICENSE = "BSD-3-Clause"

PV = "3.3.0"

RPM_NAME = "python310-cma-3.3.0-1.5.noarch.rpm"
RPM_HASH = "cb545fb7624556bf2d10fedb5e24728d4326822adcf70ad74c3798499a3f2e54f312ce3fe6156bb1575ad3b711fe30bed15fb4ad59bb1b4d7592e761dce02e04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-cma \
python310-cma \
python3dist-cma"

RDEPENDS:${PN} += "python-abi \
python310-numpy"

inherit rpm
