SUMMARY = "Python library for arbitrary-precision floating-point arithmetic"
DESCRIPTION = "Mpmath is a pure-Python library for multiprecision floating-point \
arithmetic. It provides a set of transcendental functions, \
unlimited exponent sizes, complex numbers, interval arithmetic, \
numerical integration and differentiation, root-finding, linear \
algebra, and others. Almost any calculation can be performed just \
as well at 10-digit or 1000-digit precision, and in many cases, mpmath \
implements algorithms that scale well for high precision work. \
If available, mpmath will (optionally) use gmpy to speed up high \
precision operations."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "python311-mpmath-1.2.1-3.5.noarch.rpm"
RPM_HASH = "5c8614bf0fc975aa396c8f1161c15a0b092da602fa8073abbbac3a8658d8913fcf5f324e8aca6a0e97f677a511c49e5813f55cdb1f3e0bc0f68bc91b5441f7bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mpmath \
python3.11dist-mpmath \
python311-mpmath \
python3dist-mpmath"

RDEPENDS:${PN} += "python-abi \
python311-gmpy2"

inherit rpm
