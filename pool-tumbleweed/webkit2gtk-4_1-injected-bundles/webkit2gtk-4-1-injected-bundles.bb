SUMMARY = "Injected bundles for webkit2gtk3"
DESCRIPTION = "WebKit is a web content engine, derived from KHTML and KJS from KDE, \
and used primarily in Apple's Safari browser.  It is made to be \
embedded in other applications, such as mail readers, or web browsers. \
 \
It is able to display content such as HTML, SVG, XML, and others. It \
also supports DOM, XMLHttpRequest, XSLT, CSS, Javascript/ECMAscript and \
more."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.40.5"

RPM_NAME = "webkit2gtk-4_1-injected-bundles-2.40.5-3.1.aarch64.rpm"
RPM_HASH = "a70846381fa064dceeb1df9c2bc443ded22f799d181de719615a5fb803a6bd501ad810e54b55937e869f9387538c2b5c3ed343abc879987e4b3b78aec7809f8d"

RPROVIDES:${PN} += "libwebkit2gtkinjectedbundle.so \
webkit2gtk-4-1-injected-bundles"

RDEPENDS:${PN} += "libwebkit2gtk-4.1.so.0"

inherit rpm
