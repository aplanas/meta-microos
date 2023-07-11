SUMMARY = "Fast fractions data type for rational numbers"
DESCRIPTION = "Python's Fraction data type is an excellent way to do exact money \
calculations and largely beats Decimal in terms of simplicity, \
accuracy and safety.  Clearly not in terms of speed, though, given \
the cdecimal accelerator in Py3.3+. \
 \
Quicktions is an adaptation of the original fractions module \
(as included in CPython 3.5) that is compiled and optimised with \
Cython into a fast, native extension module. \
 \
Compared to the standard library fractions module in Py2.7 and \
Py3.4, quicktions is currently about 10x faster, and still about \
6x faster than the current version in Python 3.5.  It's also about \
15x faster than the (Python implemented) decimal module in Py2.7."
LICENSE = "Python-2.0"

PV = "1.14"

RPM_NAME = "python311-quicktions-1.14-1.5.aarch64.rpm"
RPM_HASH = "e2f3925f7d5a75061ac5de957c1029f032b2aa16dea921b3024349a0ad4dec9a7746d7232a47b894d3deb397dd64495e380b97dcbde056af376fe50716a7712c"

RPROVIDES:${PN} += "python3-quicktions \
python3.11dist-quicktions \
python311-quicktions \
python3dist-quicktions"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
