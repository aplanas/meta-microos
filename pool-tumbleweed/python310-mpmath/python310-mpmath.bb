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

RPM_NAME = "python310-mpmath-1.2.1-3.5.noarch.rpm"
RPM_HASH = "dcce95e8ea257ca6732768c217bdfb6cd76b7940f54c533752d2e48e9817d29397bb20d9b8967c86ece09f86a39449cda160c9664c26a1109370b1894dbe6c40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-mpmath \
python310-mpmath \
python3dist-mpmath"

RDEPENDS:${PN} += "python-abi \
python310-gmpy2"

inherit rpm
