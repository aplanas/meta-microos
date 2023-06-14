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

RPM_NAME = "python39-pyerfa-2.0.0.3-1.1.aarch64.rpm"
RPM_HASH = "a9628ee865fa6bcc5c72a9f24e2ca76de5f242576b76c484d0e494a4516127003dd9ef8d8272f77c13a71a1c1047de8071fc81a926990bd1017a50c401a02e5c"

RPROVIDES:${PN} += "python3.9dist-pyerfa \
python39-pyerfa \
python3dist-pyerfa"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liberfa.so.1 \
python-abi \
python39-numpy"

inherit rpm
