SUMMARY = "Python bindings for VIPS image processing library"
DESCRIPTION = "This package contains the Python bindings for the VIPS library."
LICENSE = "MIT"

PV = "2.2.1"

RPM_NAME = "python310-pyvips-2.2.1-1.5.noarch.rpm"
RPM_HASH = "72abe93d55afbff63b755f345076d49ead66ad84c2bd7f8dc1544748b2894c65accc0fefbcb8272a95e54a4a946a18b0ebe235fe947cf2c7eb2863e688c085cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pyvips \
python310-pyvips \
python3dist-pyvips"

RDEPENDS:${PN} += "python-abi \
python310-cffi"

inherit rpm
