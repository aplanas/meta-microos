SUMMARY = "Thread-pool Controls"
DESCRIPTION = "Python helpers to limit the number of threads used in native \
libraries that handle their own internal threadpool (BLAS \
and OpenMP implementations)."
LICENSE = "BSD-3-Clause"

PV = "3.1.0"

RPM_NAME = "python310-threadpoolctl-3.1.0-3.3.noarch.rpm"
RPM_HASH = "36d146eeabc5f5bf5c1ff3b92356ab76d47804acf5600262dea703cf957af035dd11adbe14deeffb813ce99b69a3bc853b7411c0899b1d5ef20cc448785bcdae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-threadpoolctl \
python310-threadpoolctl \
python3dist-threadpoolctl"

RDEPENDS:${PN} += "python-abi"

inherit rpm
