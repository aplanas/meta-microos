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

RPM_NAME = "python310-mpmath-1.2.1-3.3.noarch.rpm"
RPM_HASH = "5446b78c08961ca861ddd6b2170577b16403643720bd6f98edfafbdc0fc314c17dc8cb80c77cc8f3a32781fe049baa45194e738e1e979041c9da1e5a267cedf4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mpmath \
python3.10dist(mpmath) \
python310-mpmath \
python3dist(mpmath)"
RDEPENDS:${PN} += "python(abi) \
python310-gmpy2"

inherit rpm
