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

RPM_NAME = "python39-quicktions-1.14-1.5.aarch64.rpm"
RPM_HASH = "1bd358b23a8963a49a3e86e1002fd82d73278d221e832b39922c609999c0c37f1ee6732021650a4bff73a6c37039c9963cbd9fd7bf5d89821c6b468d1e282095"

RPROVIDES:${PN} += "python3.9dist-quicktions \
python39-quicktions \
python3dist-quicktions"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
