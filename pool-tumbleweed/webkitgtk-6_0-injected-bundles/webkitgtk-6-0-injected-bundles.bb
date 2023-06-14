SUMMARY = "Injected bundles for webkit2gtk4"
DESCRIPTION = "WebKit is a web content engine, derived from KHTML and KJS from KDE, \
and used primarily in Apple's Safari browser.  It is made to be \
embedded in other applications, such as mail readers, or web browsers. \
 \
It is able to display content such as HTML, SVG, XML, and others. It \
also supports DOM, XMLHttpRequest, XSLT, CSS, Javascript/ECMAscript and \
more."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.40.2"

RPM_NAME = "webkitgtk-6_0-injected-bundles-2.40.2-1.1.aarch64.rpm"
RPM_HASH = "78d4aac465e5c2af8c627df3b63d43af85f8a9186beedf809b754b3255d94572b557e8c49f7e1460de5274b1002db97f6cca9c8f1eac8df2c1e17dc251463c3d"

RPROVIDES:${PN} += "libwebkitgtkinjectedbundle.so \
webkitgtk-6-0-injected-bundles"

RDEPENDS:${PN} += "libwebkitgtk-6.0.so.4"

inherit rpm
