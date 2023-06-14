SUMMARY = "Injected bundles for webkit2gtk3-soup2"
DESCRIPTION = "WebKit is a web content engine, derived from KHTML and KJS from KDE, \
and used primarily in Apple's Safari browser.  It is made to be \
embedded in other applications, such as mail readers, or web browsers. \
 \
It is able to display content such as HTML, SVG, XML, and others. It \
also supports DOM, XMLHttpRequest, XSLT, CSS, Javascript/ECMAscript and \
more."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.40.2"

RPM_NAME = "webkit2gtk-4_0-injected-bundles-2.40.2-1.1.aarch64.rpm"
RPM_HASH = "35d4128cbc2065975db930298d5d31472eaec1f0dc0d4f6b2f26bf14a8125f34cd6df99c40aba27975923e4b98c26b8028b0114702216b1d3d05ecc6fc185216"

RPROVIDES:${PN} += "libwebkit2gtkinjectedbundle.so \
webkit2gtk-4-0-injected-bundles"

RDEPENDS:${PN} += "libwebkit2gtk-4.0.so.37"

inherit rpm
