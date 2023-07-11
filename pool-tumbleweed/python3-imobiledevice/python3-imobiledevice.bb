SUMMARY = "Python bindings for libimobiledevice"
DESCRIPTION = "Contains Python bindings for developing applications that use libimobiledevice."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.0+179git.20230430"

RPM_NAME = "python3-imobiledevice-1.3.0+179git.20230430-1.2.aarch64.rpm"
RPM_HASH = "fcc9cd208e434291b7b1ac07cf4837b6d1ef2c460f57ca8dd62dd2474c13c576ad8068350eed5f8824388c186149d672ba7218f171fa61c02067b522f94e9e1d"

RPROVIDES:${PN} += "python3-imobiledevice"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libimobiledevice-1-0-6 \
libimobiledevice-1.0.so.6 \
libplist-2.0.so.4 \
libpython3.11.so.1.0 \
python-abi \
python3-plist"

inherit rpm
