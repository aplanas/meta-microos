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

RPM_NAME = "python39-joblib-1.2.0-1.3.noarch.rpm"
RPM_HASH = "cc759727595241892d9fe6792f1db7a9f9208845edd04e34ca2fa3395e96ae8c3a54a55398b192046794d60b21201064db3f8df3a6208e207e2c42d761405447"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(joblib) \
python39-joblib \
python3dist(joblib)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
