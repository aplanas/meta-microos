SUMMARY = "Thread-pool Controls"
DESCRIPTION = "Python helpers to limit the number of threads used in native \
libraries that handle their own internal threadpool (BLAS \
and OpenMP implementations)."
LICENSE = "BSD-3-Clause"

PV = "3.1.0"

RPM_NAME = "python311-threadpoolctl-3.1.0-3.3.noarch.rpm"
RPM_HASH = "37f5dfee0a2917932f860d62ee2dbb1a3e378131c6a825ab28aa2e7e72e999491d274a35e4e7716170eb7c23af6fc5434b97e82eebc982198368dd127080aa79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-threadpoolctl \
python3.11dist-threadpoolctl \
python311-threadpoolctl \
python3dist-threadpoolctl"

RDEPENDS:${PN} += "python-abi"

inherit rpm
