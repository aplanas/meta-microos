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

RPM_NAME = "python39-joblib-1.2.0-2.3.noarch.rpm"
RPM_HASH = "ca3cb95ff8bf9eedc2d80dd72820d895dae7704e832c4d6fcb269551c67d4d1253c3165136db166dcb5e3b4c879b65fa92aa7b7d9bcd23dd9c8d2f36f7398ffa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-joblib \
python39-joblib \
python3dist-joblib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
