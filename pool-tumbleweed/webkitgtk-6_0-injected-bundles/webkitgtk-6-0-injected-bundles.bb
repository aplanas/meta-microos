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

RPM_NAME = "webkitgtk-6_0-injected-bundles-2.40.5-3.1.aarch64.rpm"
RPM_HASH = "024f15ca5e8931732f3f7cb3c791e1742699ee71429f139d29a6c8f218ffa72d915764e4b6fd39a83971342246d16fa9bb2bf232e60f2a59675ad449851ea15b"

RPROVIDES:${PN} += "libwebkitgtkinjectedbundle.so \
webkitgtk-6-0-injected-bundles"

RDEPENDS:${PN} += "libwebkitgtk-6.0.so.4"

inherit rpm
