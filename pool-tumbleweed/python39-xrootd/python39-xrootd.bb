SUMMARY = "Python bindings for xrootd"
DESCRIPTION = "This package provides python3 bindings for xrootd."
LICENSE = "LGPL-3.0-or-later"

PV = "5.6.1"

RPM_NAME = "python39-xrootd-5.6.1-1.1.aarch64.rpm"
RPM_HASH = "fd15e12136db46b874caecda25763310cb5128e7908799cca0920aeecda9a74198f92c34ad8ce7de9302b830e7938d0bfe26fda2855b64db3d1b45bf5bb9fed3"

RPROVIDES:${PN} += "python3.9dist-xrootd \
python39-xrootd \
python3dist-xrootd"

RDEPENDS:${PN} += "libXrdCl.so.3 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python-abi"

inherit rpm
