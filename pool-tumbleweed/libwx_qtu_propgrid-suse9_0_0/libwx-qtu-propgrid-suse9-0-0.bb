SUMMARY = "wxWidgets property grid class library"
DESCRIPTION = "wxPropertyGrid is a specialized grid for editing properties, in other \
words, name=value pairs."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_qtu_propgrid-suse9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "5d5028f8025eb1a906102cc5d89cd5adb89f809095feadbbb85c24b8da15d006ccb94b126adcd45640bac9a14ebed9b8b6e95b5deaa62e73404beff4521c841b"

RPROVIDES:${PN} += "libwx-qtu-propgrid-suse.so.9.0.0 \
libwx-qtu-propgrid-suse9-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-suse.so.9.0.0 \
libwx-qtu-core-suse.so.9.0.0"

inherit rpm
