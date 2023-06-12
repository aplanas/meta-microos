SUMMARY = "wxWidgets advanced widgets and rarely-used widgets"
DESCRIPTION = "Advanced or rarely-used GUI classes for wxWidgets."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk3u_adv-suse-nostl9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "b93ea21f552b8e8de0a86156028a88b8c8d6929cbcdc8323a2ae5c9a19d33d51b56f2a5a88fdc206866c87d79fc24ade84f1f0533a3c49beaf1eb8be6c5362e1"

RPROVIDES:${PN} += "libwx_gtk3u_adv-suse-nostl.so.9.0.0()(64bit) \
libwx_gtk3u_adv-suse-nostl.so.9.0.0(WXU_3.2)(64bit) \
libwx_gtk3u_adv-suse-nostl.so.9.0.0(WXU_3.2.1)(64bit) \
libwx_gtk3u_adv-suse-nostl.so.9.0.0(WXU_3.2.2)(64bit) \
libwx_gtk3u_adv-suse-nostl9_0_0 \
libwx_gtk3u_adv-suse-nostl9_0_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
