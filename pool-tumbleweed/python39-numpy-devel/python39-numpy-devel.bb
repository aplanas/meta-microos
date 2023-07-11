SUMMARY = "Development files for numpy applications"
DESCRIPTION = "This package contains files for developing applications using numpy."
LICENSE = "BSD-3-Clause"

PV = "1.24.2"

RPM_NAME = "python39-numpy-devel-1.24.2-4.1.aarch64.rpm"
RPM_HASH = "b49bc073cdd4fb1beb8b344e5dae6f29eec53e321555b8a25b30925b1a86cac8fa65e6bcd429f440136a515dda9d3a65866306ab68853ac29c4c2a337d5ea41e"

RPROVIDES:${PN} += "python39-numpy-devel"

RDEPENDS:${PN} += "blas-devel \
cblas-devel \
lapack-devel \
python-abi \
python39-devel \
python39-numpy"

inherit rpm
