SUMMARY = "Covariance Matrix Adaptation Evolution Strategy numerical optimizer"
DESCRIPTION = "A stochastic numerical optimization algorithm for difficult \
(non-convex, ill-conditioned, multi-modal, rugged, noisy) optimization \
problems in continuous search spaces, implemented in Python."
LICENSE = "BSD-3-Clause"

PV = "3.3.0"

RPM_NAME = "python311-cma-3.3.0-1.5.noarch.rpm"
RPM_HASH = "d6090e0433cc73ee300dfa66a82854e92e933ce843611b481d1677274f92a53e017402284d53f1f3f8c45863eb820aea6c8f4ff930f9569863c7d63ddfeee292"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cma \
python3.11dist-cma \
python311-cma \
python3dist-cma"

RDEPENDS:${PN} += "python-abi \
python311-numpy"

inherit rpm
