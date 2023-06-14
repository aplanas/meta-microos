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

RPM_NAME = "python311-pyerfa-2.0.0.3-1.1.aarch64.rpm"
RPM_HASH = "139ccb04c6910f4735f25b643db425792294956ffad70591f6895fe81b9e177779f40e49e80f953ad83a88e4f0c96f80f2df51ae1a26e603a45d04c81fc497fe"

RPROVIDES:${PN} += "python3.11dist-pyerfa \
python311-pyerfa \
python3dist-pyerfa"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liberfa.so.1 \
python-abi \
python311-numpy"

inherit rpm
