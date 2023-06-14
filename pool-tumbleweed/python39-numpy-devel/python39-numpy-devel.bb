SUMMARY = "Development files for numpy applications"
DESCRIPTION = "This package contains files for developing applications using numpy."
LICENSE = "BSD-3-Clause"

PV = "1.24.2"

RPM_NAME = "python39-numpy-devel-1.24.2-3.1.aarch64.rpm"
RPM_HASH = "123ee5ddf2d2bc0ca889b413d81d86c4962b4aa013488ab36e9a50bc450ea52f30246566ea499a673d269ed47410bf0d6272289d960997b6ba7905e34c2073cb"

RPROVIDES:${PN} += "python39-numpy-devel"

RDEPENDS:${PN} += "blas-devel \
cblas-devel \
lapack-devel \
python-abi \
python39-devel \
python39-numpy"

inherit rpm
