SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_baseu-suse3_0_5-3.0.5.1-4.2.aarch64.rpm"
RPM_HASH = "1b7c9f9ae4e34bea9e57cb7914266dd7f58ef64af61617386f841216856604f3e26439010794169ec28beaac2a26338c866ed31e72c25c711c1243c7e410e08a"

RPROVIDES:${PN} += "libwx-baseu-suse.so.3.0.5 \
libwx-baseu-suse3-0-5 \
wxWidgets"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
