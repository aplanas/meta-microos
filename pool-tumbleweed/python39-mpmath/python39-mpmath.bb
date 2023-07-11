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

RPM_NAME = "python39-mpmath-1.2.1-3.5.noarch.rpm"
RPM_HASH = "072aaf66bf202df8adb1300cbbc96ebcaec03c6249804ee6c5e6d385dcbe9dfda39302f3c417142b938146270a10fb49a684e69765f2512a909f3c7c222b59e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-mpmath \
python39-mpmath \
python3dist-mpmath"

RDEPENDS:${PN} += "python-abi \
python39-gmpy2"

inherit rpm
