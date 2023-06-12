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

RPM_NAME = "python39-mpmath-1.2.1-3.3.noarch.rpm"
RPM_HASH = "5313dd7efd3deb7512d281f374888d6b0ee23d6f3227514a0bf8c1a9574b559c1bb557ef5564396c19c50640f3f9b196ac375ed2bf26cf2337d629729f326602"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(mpmath) \
python39-mpmath \
python3dist(mpmath)"
RDEPENDS:${PN} += "python(abi) \
python39-gmpy2"

inherit rpm
