SUMMARY = "JavaScript Core Engine, GTK+ Port"
DESCRIPTION = "WebKit is a web content engine, derived from KHTML and KJS from KDE, \
and used primarily in Apple's Safari browser.  It is made to be \
embedded in other applications, such as mail readers, or web browsers. \
 \
It is able to display content such as HTML, SVG, XML, and others. It \
also supports DOM, XMLHttpRequest, XSLT, CSS, Javascript/ECMAscript and \
more."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.40.2"

RPM_NAME = "libjavascriptcoregtk6_0-1-2.40.2-1.1.aarch64.rpm"
RPM_HASH = "f66a3950b2816b2ac158613f8a7a9e643e8f3538bd7bbd2a857bb163e4f6e3343ced41b049a3f3b600985d8d415d7d0246aa6b49bd0abd6fcde9fde69ac68ce3"

RPROVIDES:${PN} += "libjavascriptcoregtk-6.0.so.1()(64bit) \
libjavascriptcoregtk6_0-1 \
libjavascriptcoregtk6_0-1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libicui18n.so.73()(64bit) \
libicuuc.so.73()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit)"

inherit rpm
