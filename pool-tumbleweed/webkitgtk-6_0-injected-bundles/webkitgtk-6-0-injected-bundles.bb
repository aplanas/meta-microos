SUMMARY = "Injected bundles for webkit2gtk4"
DESCRIPTION = "WebKit is a web content engine, derived from KHTML and KJS from KDE, \
and used primarily in Apple's Safari browser.  It is made to be \
embedded in other applications, such as mail readers, or web browsers. \
 \
It is able to display content such as HTML, SVG, XML, and others. It \
also supports DOM, XMLHttpRequest, XSLT, CSS, Javascript/ECMAscript and \
more."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.40.5"

RPM_NAME = "webkitgtk-6_0-injected-bundles-2.40.5-1.1.aarch64.rpm"
RPM_HASH = "8b2419060d5e20b9c39ba503b2767e3d378e2ac36c7ccd7d5adbbb2ae2ed4cc889079b5bcf55646e8c265b8152adeda85674f0eb41662e5876192014c7e84c23"

RPROVIDES:${PN} += "libwebkitgtkinjectedbundle.so \
webkitgtk-6-0-injected-bundles"

RDEPENDS:${PN} += "libwebkitgtk-6.0.so.4"

inherit rpm
