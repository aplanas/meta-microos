SUMMARY = "Covariance Matrix Adaptation Evolution Strategy numerical optimizer"
DESCRIPTION = "A stochastic numerical optimization algorithm for difficult \
(non-convex, ill-conditioned, multi-modal, rugged, noisy) optimization \
problems in continuous search spaces, implemented in Python."
LICENSE = "BSD-3-Clause"

PV = "3.3.0"

RPM_NAME = "python311-cma-3.3.0-1.3.noarch.rpm"
RPM_HASH = "e886b5c5b50a14567e385d7a60ee5da55f45b0f147106b69902e812b5f0a144d07f5c6f1ae2b59f341ef84acf1f277fd3a7a16ca6bf930732273eb280870130b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(cma) \
python311-cma \
python3dist(cma)"

RDEPENDS:${PN} += "python(abi) \
python311-numpy"

inherit rpm
