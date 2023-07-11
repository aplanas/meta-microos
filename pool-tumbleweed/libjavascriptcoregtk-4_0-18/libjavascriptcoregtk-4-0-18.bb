SUMMARY = "JavaScript Core Engine, GTK+ Port"
DESCRIPTION = "WebKit is a web content engine, derived from KHTML and KJS from KDE, \
and used primarily in Apple's Safari browser.  It is made to be \
embedded in other applications, such as mail readers, or web browsers. \
 \
It is able to display content such as HTML, SVG, XML, and others. It \
also supports DOM, XMLHttpRequest, XSLT, CSS, Javascript/ECMAscript and \
more."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.40.3"

RPM_NAME = "libjavascriptcoregtk-4_0-18-2.40.3-1.1.aarch64.rpm"
RPM_HASH = "0531b15afeb6302a53a4e2c4ef48f95a7dbcc8276236f9a71169e3483ebb2c8930eb591868273299619c2425dfbf14d069e59d7c71fd6d3ac590217f367f1f6d"

RPROVIDES:${PN} += "libjavascriptcoregtk-4-0-18 \
libjavascriptcoregtk-4.0.so.18"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libicui18n.so.73 \
libicuuc.so.73 \
libm.so.6 \
libstdc++.so.6 \
libsystemd.so.0"

inherit rpm
