SUMMARY = "Covariance Matrix Adaptation Evolution Strategy numerical optimizer"
DESCRIPTION = "A stochastic numerical optimization algorithm for difficult \
(non-convex, ill-conditioned, multi-modal, rugged, noisy) optimization \
problems in continuous search spaces, implemented in Python."
LICENSE = "BSD-3-Clause"

PV = "3.3.0"

RPM_NAME = "python39-cma-3.3.0-1.5.noarch.rpm"
RPM_HASH = "24c5e0af097855e75cfd90b91ec5a28fd42d34c2844f859529702fdf079bda1608e8a288ceb7ce0766ab3181d11bd12f123a6626d4763547162919bccd511f3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-cma \
python39-cma \
python3dist-cma"

RDEPENDS:${PN} += "python-abi \
python39-numpy"

inherit rpm
