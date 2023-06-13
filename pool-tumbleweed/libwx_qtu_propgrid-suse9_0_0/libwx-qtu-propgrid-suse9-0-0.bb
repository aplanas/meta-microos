SUMMARY = "wxWidgets property grid class library"
DESCRIPTION = "wxPropertyGrid is a specialized grid for editing properties, in other \
words, name=value pairs."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_qtu_propgrid-suse9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "5d5028f8025eb1a906102cc5d89cd5adb89f809095feadbbb85c24b8da15d006ccb94b126adcd45640bac9a14ebed9b8b6e95b5deaa62e73404beff4521c841b"

RPROVIDES:${PN} += "libwx_qtu_propgrid-suse.so.9.0.0()(64bit) \
libwx_qtu_propgrid-suse9_0_0 \
libwx_qtu_propgrid-suse9_0_0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libwx_baseu-suse.so.9.0.0()(64bit) \
libwx_qtu_core-suse.so.9.0.0()(64bit)"

inherit rpm
