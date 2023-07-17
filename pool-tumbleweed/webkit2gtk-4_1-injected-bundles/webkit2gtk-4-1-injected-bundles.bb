SUMMARY = "Injected bundles for webkit2gtk3"
DESCRIPTION = "WebKit is a web content engine, derived from KHTML and KJS from KDE, \
and used primarily in Apple's Safari browser.  It is made to be \
embedded in other applications, such as mail readers, or web browsers. \
 \
It is able to display content such as HTML, SVG, XML, and others. It \
also supports DOM, XMLHttpRequest, XSLT, CSS, Javascript/ECMAscript and \
more."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.40.3"

RPM_NAME = "webkit2gtk-4_1-injected-bundles-2.40.3-2.1.aarch64.rpm"
RPM_HASH = "90e13b1dcf9f090e816753c2b0033c7ac85698e47450f76b9b62d82bd4540f728436e06438c562066f3ebfde6ae28b3b50300ffb7525bbfb22c2dc1e08563be2"

RPROVIDES:${PN} += "libwebkit2gtkinjectedbundle.so \
webkit2gtk-4-1-injected-bundles"

RDEPENDS:${PN} += "libwebkit2gtk-4.1.so.0"

inherit rpm
