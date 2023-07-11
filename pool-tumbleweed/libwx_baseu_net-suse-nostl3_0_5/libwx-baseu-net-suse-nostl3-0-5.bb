SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_baseu_net-suse-nostl3_0_5-3.0.5.1-4.2.aarch64.rpm"
RPM_HASH = "a62845bb3a451c45bb8c45450e0e551ec7f469a15a098361de2edefdcee4abeac0e12a089289a696b697ad06a12512b21f3497f1bdd90dacbd90b884634b52ed"

RPROVIDES:${PN} += "libwx-baseu-net-suse-nostl.so.3.0.5 \
libwx-baseu-net-suse-nostl3-0-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwx-baseu-suse-nostl.so.3.0.5"

inherit rpm
