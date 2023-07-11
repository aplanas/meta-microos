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

RPM_NAME = "python39-pyerfa-2.0.0.3-1.3.aarch64.rpm"
RPM_HASH = "3312a1f10a62fc913c02f8ef19d0258c306be55e2faa636a6a2bf7b8826de7d764b39edff5a91e61ea7c0899578a32fdf23496247ca7f8c9222e5994c177eabb"

RPROVIDES:${PN} += "python3.9dist-pyerfa \
python39-pyerfa \
python3dist-pyerfa"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liberfa.so.1 \
python-abi \
python39-numpy"

inherit rpm
