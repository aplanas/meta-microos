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

RPM_NAME = "webkit2gtk-4_1-injected-bundles-2.40.5-1.1.aarch64.rpm"
RPM_HASH = "d220ddfca30a3afb85ae85d0ff9c36b4badaa715df6c251c48d07e736a6f30643b386e9289f612778ede1dc9b4f7b0e56fd25856915a949ab1ad62090136181b"

RPROVIDES:${PN} += "libwebkit2gtkinjectedbundle.so \
webkit2gtk-4-1-injected-bundles"

RDEPENDS:${PN} += "libwebkit2gtk-4.1.so.0"

inherit rpm
