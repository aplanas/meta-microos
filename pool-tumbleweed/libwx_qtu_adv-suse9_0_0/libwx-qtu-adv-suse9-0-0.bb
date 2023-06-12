SUMMARY = "wxWidgets advanced widgets and rarely-used widgets"
DESCRIPTION = "Advanced or rarely-used GUI classes for wxWidgets."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_qtu_adv-suse9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "ea5701650562b0bb1e0eef531611e76c4bf2fb4ffffaf89921918272f205f8ae826744b8a84101800b3c265591a261593ca32b324ee01dc3504b29e2fde56b7e"

RPROVIDES:${PN} += "libwx_qtu_adv-suse.so.9.0.0()(64bit) \
libwx_qtu_adv-suse.so.9.0.0(WXU_3.2)(64bit) \
libwx_qtu_adv-suse.so.9.0.0(WXU_3.2.1)(64bit) \
libwx_qtu_adv-suse.so.9.0.0(WXU_3.2.2)(64bit) \
libwx_qtu_adv-suse9_0_0 \
libwx_qtu_adv-suse9_0_0(aarch-64)"
RDEPENDS:${PN} += "/sbin/ldconfig"

inherit rpm
