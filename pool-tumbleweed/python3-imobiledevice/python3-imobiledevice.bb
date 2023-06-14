SUMMARY = "Python bindings for libimobiledevice"
DESCRIPTION = "Contains Python bindings for developing applications that use libimobiledevice."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.0+git.20210921"

RPM_NAME = "python3-imobiledevice-1.3.0+git.20210921-1.8.aarch64.rpm"
RPM_HASH = "b4400ffb3ff1ccd737396ab1a82302e61006654b8357a7ba8c3abd6496e22362a1afe5f8cacbe1f24a25e89ecb6eabb8043716f953e0501ec818e85380061425"

RPROVIDES:${PN} += "python3-imobiledevice"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libimobiledevice-1-0-6 \
libimobiledevice-1.0.so.6 \
libplist-2.0.so.3 \
libpython3.10.so.1.0 \
python-abi \
python3-plist"

inherit rpm
