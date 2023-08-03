SUMMARY = "Injected bundles for webkit2gtk3"
DESCRIPTION = "WebKit is a web content engine, derived from KHTML and KJS from KDE, \
and used primarily in Apple's Safari browser.  It is made to be \
embedded in other applications, such as mail readers, or web browsers. \
 \
It is able to display content such as HTML, SVG, XML, and others. It \
also supports DOM, XMLHttpRequest, XSLT, CSS, Javascript/ECMAscript and \
more."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.40.4"

RPM_NAME = "webkit2gtk-4_1-injected-bundles-2.40.4-1.1.aarch64.rpm"
RPM_HASH = "113e90fae07d2b70343b135ee362edbf885e4496fc79aea32cbfaedcc76c07c7abe2f7f31677fd22ae337a73693eab6b2a594486f55cf3a2f2c535d53175aae9"

RPROVIDES:${PN} += "libwebkit2gtkinjectedbundle.so \
webkit2gtk-4-1-injected-bundles"

RDEPENDS:${PN} += "libwebkit2gtk-4.1.so.0"

inherit rpm
