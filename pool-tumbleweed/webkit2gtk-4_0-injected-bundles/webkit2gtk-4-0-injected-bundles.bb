SUMMARY = "Injected bundles for webkit2gtk3-soup2"
DESCRIPTION = "WebKit is a web content engine, derived from KHTML and KJS from KDE, \
and used primarily in Apple's Safari browser.  It is made to be \
embedded in other applications, such as mail readers, or web browsers. \
 \
It is able to display content such as HTML, SVG, XML, and others. It \
also supports DOM, XMLHttpRequest, XSLT, CSS, Javascript/ECMAscript and \
more."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.40.4"

RPM_NAME = "webkit2gtk-4_0-injected-bundles-2.40.4-1.1.aarch64.rpm"
RPM_HASH = "2ca1057a76e6a2fd2589cf199f50bdf535aed25ae7ca231cbc14b457f60238ebeb5018a08f04ca858aeebc2816422f4ea1b49ec09e28c181a79681c644b5f870"

RPROVIDES:${PN} += "libwebkit2gtkinjectedbundle.so \
webkit2gtk-4-0-injected-bundles"

RDEPENDS:${PN} += "libwebkit2gtk-4.0.so.37"

inherit rpm
