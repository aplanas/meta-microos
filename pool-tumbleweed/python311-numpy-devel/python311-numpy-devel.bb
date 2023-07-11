SUMMARY = "Development files for numpy applications"
DESCRIPTION = "This package contains files for developing applications using numpy."
LICENSE = "BSD-3-Clause"

PV = "1.24.2"

RPM_NAME = "python311-numpy-devel-1.24.2-4.1.aarch64.rpm"
RPM_HASH = "1a17aa37cd7ea3bb9c9b42419d6db712b4383beb1c83aacb639497c782baf7b7537e0328458e4e08f72a8cd2053fdf1fa978030ee86bdc1edabc9c4eb478e906"

RPROVIDES:${PN} += "python3-numpy-devel \
python311-numpy-devel"

RDEPENDS:${PN} += "blas-devel \
cblas-devel \
lapack-devel \
python-abi \
python311-devel \
python311-numpy"

inherit rpm
