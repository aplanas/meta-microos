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

RPM_NAME = "python311-quicktions-1.14-2.1.aarch64.rpm"
RPM_HASH = "539c8976d145bdae664cd1dfa25ff88095df45fb4d6455a6aa9cfd0883de19d7c256064e49d3636a64eea8be4613c222f29aebce9d4543301244bd3a0acb670d"

RPROVIDES:${PN} += "python3-quicktions \
python3.11dist-quicktions \
python311-quicktions \
python3dist-quicktions"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
