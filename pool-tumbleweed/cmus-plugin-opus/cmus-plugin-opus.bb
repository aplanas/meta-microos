SUMMARY = "Opus input plugin for the C* Music Player"
DESCRIPTION = "This package provides Opus input support for the C* Music Player."
LICENSE = "GPL-2.0-only"

PV = "2.10.0"

RPM_NAME = "cmus-plugin-opus-2.10.0-2.1.aarch64.rpm"
RPM_HASH = "b47e8a5a10e2fda0af9f2aa8bb99190a0518139492b48b3ae0782aca9808eed9f7569da8b3c1618d982dc097f6fbad31e49e5d4e7047c2b812dcc3700cfa756b"

RPROVIDES:${PN} += "cmus-plugin-opus \
cmus-plugin-opus(aarch-64)"

RDEPENDS:${PN} += "cmus \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libopusfile.so.0()(64bit)"

inherit rpm
