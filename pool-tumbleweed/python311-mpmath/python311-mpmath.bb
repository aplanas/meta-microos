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

RPM_NAME = "python311-mpmath-1.2.1-3.3.noarch.rpm"
RPM_HASH = "b87534a6822143a05a067ee52a7e20054ddec966b6283d125bef15b3d59ad21dbe623c6bc33ce2bb793c0b41813fe1c92fc16a426cffaeeb34181b78c2772217"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-mpmath \
python311-mpmath \
python3dist-mpmath"

RDEPENDS:${PN} += "python-abi \
python311-gmpy2"

inherit rpm
