SUMMARY = "Deepin Turbo libraries"
DESCRIPTION = "The package provides libraries for deepin-turbo."
LICENSE = "LGPL-2.1+"

PV = "0.0.5"

RPM_NAME = "libdeepin-turbo0-0.0.5-2.9.aarch64.rpm"
RPM_HASH = "3a7346afe788ee715189a15e1721de42f40a00a8e06f7d8599571fbd6eceef0acc60c5ad7ff0b6493cf47f33e25fb0727a47d906235b7e16a62c835479033c9f"

RPROVIDES:${PN} += "libdeepin-turbo.so.0()(64bit) \
libdeepin-turbo0 \
libdeepin-turbo0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit)"

inherit rpm
