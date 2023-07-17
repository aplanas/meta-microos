SUMMARY = "Library to access storage media devices"
DESCRIPTION = "libsmdev is a library to access and read storage media devices."
LICENSE = "LGPL-3.0-or-later"

PV = "20221028"

RPM_NAME = "python311-libsmdev-20221028-2.12.aarch64.rpm"
RPM_HASH = "3d92f18db8e7d1138413db99045e5fb4a476aad24eb6afc23d69ed132a18cc33c63949a464f246babce3fbe267c3147324207339f6cf87f5d011fd4fc01e7b30"

RPROVIDES:${PN} += "python3-libsmdev \
python311-libsmdev"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libsmdev.so.1 \
python-abi"

inherit rpm
