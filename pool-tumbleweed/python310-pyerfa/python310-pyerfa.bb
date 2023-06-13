SUMMARY = "Python bindings for ERFA"
DESCRIPTION = "A Python wrapper for the ERFA library (Essential Routines for \
Fundamental Astronomy), a C library containing key algorithms for astronomy, \
which is based on the SOFA library published by the International Astronomical \
Union (IAU).  All C routines are wrapped as Numpy universal functions, \
so that they can be called with scalar or array inputs. \
 \
The project is a split of astropy._erfa module, developed in the \
context of Astropy project, into a standalone package."
LICENSE = "BSD-3-Clause"

PV = "2.0.0.3"

RPM_NAME = "python310-pyerfa-2.0.0.3-1.1.aarch64.rpm"
RPM_HASH = "f2870f27122ad91f6371150f3607bf651f0fb493a8b00d8100a8f4dc1bc6593a19e67b61594b5fc36d57eb7701d162f486b731b8b6695c68366e20e88a0c98da"

RPROVIDES:${PN} += "python3-pyerfa \
python3.10dist(pyerfa) \
python310-pyerfa \
python310-pyerfa(aarch-64) \
python3dist(pyerfa)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
liberfa.so.1()(64bit) \
python(abi) \
python310-numpy"

inherit rpm
