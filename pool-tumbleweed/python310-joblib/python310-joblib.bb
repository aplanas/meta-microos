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

RPM_NAME = "python310-joblib-1.2.0-1.3.noarch.rpm"
RPM_HASH = "7402c6c1e3dfa3b26d5fe47248c9f404f4e3d0c164b97575fef1c4ea2d0d8f7bd04c98944f3a371a3129fd455c65248e8a099dbd7abd6760c8046566340b2296"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-joblib \
python3.10dist(joblib) \
python310-joblib \
python3dist(joblib)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
