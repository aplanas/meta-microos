SUMMARY = "Injected bundles for webkit2gtk4"
DESCRIPTION = "WebKit is a web content engine, derived from KHTML and KJS from KDE, \
and used primarily in Apple's Safari browser.  It is made to be \
embedded in other applications, such as mail readers, or web browsers. \
 \
It is able to display content such as HTML, SVG, XML, and others. It \
also supports DOM, XMLHttpRequest, XSLT, CSS, Javascript/ECMAscript and \
more."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.40.4"

RPM_NAME = "webkitgtk-6_0-injected-bundles-2.40.4-1.1.aarch64.rpm"
RPM_HASH = "9e68295a93ab65e8f20281b1d77957acf40c09f03e9f415213ead1267c4fc66b953e3f7fe58874343bab099fc203671efdc542ba8226f27bffa3bba6c64d6f89"

RPROVIDES:${PN} += "libwebkitgtkinjectedbundle.so \
webkitgtk-6-0-injected-bundles"

RDEPENDS:${PN} += "libwebkitgtk-6.0.so.4"

inherit rpm
