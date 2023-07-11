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

RPM_NAME = "python310-pyerfa-2.0.0.3-1.3.aarch64.rpm"
RPM_HASH = "b637c218b2f192bf0c7b4b0b33a006b3468eeecb97b08bb492e3bc28ae20a274694447ef2aee51d9951966f50834a9d890c994917248b137ee279f4189cfa71b"

RPROVIDES:${PN} += "python3.10dist-pyerfa \
python310-pyerfa \
python3dist-pyerfa"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liberfa.so.1 \
python-abi \
python310-numpy"

inherit rpm
