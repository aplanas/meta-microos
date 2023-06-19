SUMMARY = "wxWidgets's ribbon user interface library"
DESCRIPTION = "The wxRibbon library is a set of classes for writing a ribbon user \
interface."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk2u_ribbon-suse9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "f9b24922462a3ff1411fde58619385376c5e6906bf07a8e5fdcb1e35352893e7adc52e8792d559f091dc2cdebce308ef770de5e828cf62d0897d1f77fe2e8289"

RPROVIDES:${PN} += "libwx-gtk2u-ribbon-suse.so.9.0.0 \
libwx-gtk2u-ribbon-suse9-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-suse.so.9.0.0 \
libwx-gtk2u-core-suse.so.9.0.0"

inherit rpm
