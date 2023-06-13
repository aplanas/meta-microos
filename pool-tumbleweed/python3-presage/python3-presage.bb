SUMMARY = "Intelligent predictive text entry platform (Python binding)"
DESCRIPTION = "Presage is an intelligent predictive text entry platform. \
 \
This package provides the Python binding for libpresage. \
 \
This package contains the Python extension module for libpresage."
LICENSE = "GPL-2.0-only"

PV = "0.9.1"

RPM_NAME = "python3-presage-0.9.1-13.1.aarch64.rpm"
RPM_HASH = "060e9afbc3d8809805ea7537e7218c92f2d1891cdb4fd4ef62813dad4129b9902fd5998f0fc31889f1fe3cd5ac51513b474dc0b754abea7304746897a30f2fac"

RPROVIDES:${PN} += "python-presage \
python3-presage \
python3-presage(aarch-64) \
python3.10dist(python-presage) \
python3dist(python-presage)"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libpresage.so.1()(64bit) \
libstdc++.so.6()(64bit) \
python(abi)"

inherit rpm
