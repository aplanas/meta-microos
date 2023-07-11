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

RPM_NAME = "python311-joblib-1.2.0-2.3.noarch.rpm"
RPM_HASH = "8019217685e93a6e4128a2e3618a00f9196d15016954462d08bc78e203c3bc93343c8cff907f6c06037d7c7e2a096d0832eb663ff8fe1303ff8e4818a2989ea1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-joblib \
python3.11dist-joblib \
python311-joblib \
python3dist-joblib"

RDEPENDS:${PN} += "python-abi"

inherit rpm
