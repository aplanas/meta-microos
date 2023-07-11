SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_baseu_net-suse3_0_5-3.0.5.1-4.2.aarch64.rpm"
RPM_HASH = "348ee9094ac10723266f36dde9845cf933886a1b82f68203e3b006ee09870426c885a7c57a6fb19a32b7695d0ce8e829ba0a5fb54e21a23752a89b416fff7eaf"

RPROVIDES:${PN} += "libwx-baseu-net-suse.so.3.0.5 \
libwx-baseu-net-suse3-0-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwx-baseu-suse.so.3.0.5"

inherit rpm
