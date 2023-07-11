SUMMARY = "Thread-pool Controls"
DESCRIPTION = "Python helpers to limit the number of threads used in native \
libraries that handle their own internal threadpool (BLAS \
and OpenMP implementations)."
LICENSE = "BSD-3-Clause"

PV = "3.1.0"

RPM_NAME = "python39-threadpoolctl-3.1.0-3.3.noarch.rpm"
RPM_HASH = "d0fc459f2eeb36973bdab646ddd87e85ab5d56f0c4d9aa956aced2ce840e2f4ba99dda2e91b429f17a97e2e355cf012cb6c0a703387c99009de0dd5ac53a1e9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-threadpoolctl \
python39-threadpoolctl \
python3dist-threadpoolctl"

RDEPENDS:${PN} += "python-abi"

inherit rpm
