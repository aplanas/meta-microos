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

RPM_NAME = "python311-pyerfa-2.0.0.3-1.3.aarch64.rpm"
RPM_HASH = "342d0518ffeaaa7d197fd16a3e93e23ba28fb37a6d4659fe668ba0c4a5627c7a10d6c072170f24747e79a33a5b1dddbc632f98270e13aeaacab2662a66f06dd3"

RPROVIDES:${PN} += "python3-pyerfa \
python3.11dist-pyerfa \
python311-pyerfa \
python3dist-pyerfa"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liberfa.so.1 \
python-abi \
python311-numpy"

inherit rpm
