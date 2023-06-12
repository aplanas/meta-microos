SUMMARY = "A plug-in framework for C"
DESCRIPTION = "C-Pluff is a plug-in framework for C programs."
LICENSE = "MIT"

PV = "0.2.0"

RPM_NAME = "libcpluff0-0.2.0-2.8.aarch64.rpm"
RPM_HASH = "9dbb2c1d4a044eff66daee133371a7d5961c4ba1b7dc9f876e4b0ecd074f7d4186cc439e6672829763b12f7ad36de9d1490aa4bf20e3ea0b467eb401fe3d6905"

RPROVIDES:${PN} += "libcpluff.so.0()(64bit) \
libcpluff0 \
libcpluff0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libexpat.so.1()(64bit)"

inherit rpm