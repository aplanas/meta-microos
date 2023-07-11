SUMMARY = "Module for using Python functions as pipeline jobs"
DESCRIPTION = "Joblib is a set of tools to provide lightweight pipelining in \
Python. In particular, joblib offers: \
 \
  1. transparent disk-caching of the output values and lazy re-evaluation \
     (memoize pattern) \
 \
  2. parallel computing \
 \
  3. logging and tracing of the execution \
 \
Joblib can handle large data and has specific optimizations for `numpy` arrays."
LICENSE = "BSD-3-Clause"

PV = "1.2.0"

RPM_NAME = "python310-joblib-1.2.0-2.3.noarch.rpm"
RPM_HASH = "ba414fc14983ba2307a121e923397384a80b81db32d89b04aa1d9d6d596b3a1dd6c5fe60a4322f831306757c280ca9ac0308801828f271ee21d25cb3af063643"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-joblib \
python310-joblib \
python3dist-joblib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
