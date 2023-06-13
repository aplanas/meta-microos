SUMMARY = "IBM 3270 Terminal emulator for GTK"
DESCRIPTION = "GTK-based IBM 3270 terminal emulator with many advanced features. It can be used to communicate with any IBM host that supports 3270-style connections over TELNET. \
 \
Based on the original x3270 code, pw3270 was originally created for Banco do Brasil, and is now used worldwide."
LICENSE = "GPL-2.0-only"

PV = "5.4"

RPM_NAME = "pw3270-5.4-2.1.aarch64.rpm"
RPM_HASH = "0ae4e4e1adfd237896f0f1e461f8454065e9e4cf53a3e15c0187431f003464781d9d430935ac0d0d1c5ead5292561dbffaf580aa464c7be628a1be180ff17711"

RPROVIDES:${PN} += "application() \
application(br.com.bb.pw3270.desktop) \
metainfo() \
metainfo(br.com.bb.pw3270.metainfo.xml) \
mimehandler(application/x-pw3270) \
mimehandler(x-scheme-handler/tn3270) \
mimehandler(x-scheme-handler/tn3270s) \
pw3270 \
pw3270(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
lib3270.so.5.4()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libpango-1.0.so.0()(64bit) \
libv3270.so.5.4()(64bit) \
pw3270-branding \
shared-mime-info"

inherit rpm
