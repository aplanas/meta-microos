SUMMARY = "Python Bindings for OpenColorIO"
DESCRIPTION = "This package contains python bindings for OpenColorIO."
LICENSE = "BSD-3-Clause"

PV = "2.1.2"

RPM_NAME = "python3-OpenColorIO-2.1.2-3.2.aarch64.rpm"
RPM_HASH = "82a48dbeead9bd94cbef5c562e60b3d6527c8dde83bd1515483563352891bdf2ddf4619d8019a4ad99cf8f8ccd0cb90900f9ac757d6905c8be4797d33c67d32f"

RPROVIDES:${PN} += "python-OpenColorIO \
python3-OpenColorIO"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libOpenColorIO.so.2.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi"

inherit rpm
