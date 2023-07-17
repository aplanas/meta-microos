SUMMARY = "Injected bundles for webkit2gtk3-soup2"
DESCRIPTION = "WebKit is a web content engine, derived from KHTML and KJS from KDE, \
and used primarily in Apple's Safari browser.  It is made to be \
embedded in other applications, such as mail readers, or web browsers. \
 \
It is able to display content such as HTML, SVG, XML, and others. It \
also supports DOM, XMLHttpRequest, XSLT, CSS, Javascript/ECMAscript and \
more."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.40.3"

RPM_NAME = "webkit2gtk-4_0-injected-bundles-2.40.3-2.1.aarch64.rpm"
RPM_HASH = "2f0a87a4a6a46ee4ffc7323546713d160fb547753a5128f9305e545170c8a7b4b0594b5fe73f65a9b366909630a4f5678f13faa429b68499a3219db82d8afd6d"

RPROVIDES:${PN} += "libwebkit2gtkinjectedbundle.so \
webkit2gtk-4-0-injected-bundles"

RDEPENDS:${PN} += "libwebkit2gtk-4.0.so.37"

inherit rpm
