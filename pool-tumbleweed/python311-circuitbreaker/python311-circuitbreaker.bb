SUMMARY = "Python implementation of the 'Circuit Breaker' Pattern"
DESCRIPTION = "Python implementation of the 'Circuit Breaker' Pattern"
LICENSE = "BSD-3-Clause"

PV = "1.3.2"

RPM_NAME = "python311-circuitbreaker-1.3.2-1.8.noarch.rpm"
RPM_HASH = "7fa78fa79040cdec15053311fac18b40e0618584cc26ad26bfc07cebbc7993cd23e1699e6a5df5173976537e5f22ef7391fb2f7c8e7d408279210cb3d34a8d7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(circuitbreaker) \
python311-circuitbreaker \
python3dist(circuitbreaker)"
RDEPENDS:${PN} += "python(abi)"

inherit rpm
