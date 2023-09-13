SUMMARY = "Injected bundles for webkit2gtk3-soup2"
DESCRIPTION = "WebKit is a web content engine, derived from KHTML and KJS from KDE, \
and used primarily in Apple's Safari browser.  It is made to be \
embedded in other applications, such as mail readers, or web browsers. \
 \
It is able to display content such as HTML, SVG, XML, and others. It \
also supports DOM, XMLHttpRequest, XSLT, CSS, Javascript/ECMAscript and \
more."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.40.5"

RPM_NAME = "webkit2gtk-4_0-injected-bundles-2.40.5-3.1.aarch64.rpm"
RPM_HASH = "95ab924569ddcdcef248561fba83e3f1c060336c787cdbe445d9654a62284593f55ab7ce2dd40598a66d11f9edfeb754c15b4c587f8ed9fb5010eb77760d232d"

RPROVIDES:${PN} += "libwebkit2gtkinjectedbundle.so \
webkit2gtk-4-0-injected-bundles"

RDEPENDS:${PN} += "libwebkit2gtk-4.0.so.37"

inherit rpm
