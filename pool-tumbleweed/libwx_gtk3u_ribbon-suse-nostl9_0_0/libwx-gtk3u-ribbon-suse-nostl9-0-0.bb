SUMMARY = "wxWidgets's ribbon user interface library"
DESCRIPTION = "The wxRibbon library is a set of classes for writing a ribbon user \
interface."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk3u_ribbon-suse-nostl9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "28ccbe743c73e900dfe19496152e2cd00e698f1b4a66e5b8926fcd9731f45a0d7b1d2f8bf3e54e4f9bc6e0a91c527fd8d2eaaba8d8909557be307f9daf682269"

RPROVIDES:${PN} += "libwx-gtk3u-ribbon-suse-nostl.so.9.0.0 \
libwx-gtk3u-ribbon-suse-nostl9-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-suse-nostl.so.9.0.0 \
libwx-gtk3u-core-suse-nostl.so.9.0.0"

inherit rpm
