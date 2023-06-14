SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_xrc-suse-nostl3_0_5-3.0.5.1-4.1.aarch64.rpm"
RPM_HASH = "194c74563fe9e261afa42454fcfa0f41d191d0f5708c47f3b225e9cbab92747b9d02ee79e589186cd7bb07275b2e94872d3133871350827eb1d09f2f663d8afc"

RPROVIDES:${PN} += "libwx-gtk2u-xrc-suse-nostl.so.3.0.5 \
libwx-gtk2u-xrc-suse-nostl3-0-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libwx-baseu-suse-nostl.so.3.0.5 \
libwx-baseu-xml-suse-nostl.so.3.0.5 \
libwx-gtk2u-adv-suse-nostl.so.3.0.5 \
libwx-gtk2u-core-suse-nostl.so.3.0.5 \
libwx-gtk2u-html-suse-nostl.so.3.0.5"

inherit rpm
