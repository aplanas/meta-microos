SUMMARY = "Injected bundles for webkit2gtk4"
DESCRIPTION = "WebKit is a web content engine, derived from KHTML and KJS from KDE, \
and used primarily in Apple's Safari browser.  It is made to be \
embedded in other applications, such as mail readers, or web browsers. \
 \
It is able to display content such as HTML, SVG, XML, and others. It \
also supports DOM, XMLHttpRequest, XSLT, CSS, Javascript/ECMAscript and \
more."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.40.3"

RPM_NAME = "webkitgtk-6_0-injected-bundles-2.40.3-2.1.aarch64.rpm"
RPM_HASH = "ea5e32a3ade3eaa65fa31cda5eaaa328d66a75cae1110f4d97d0e853c9777900625d8284a4934dc3bbb2180c5d52762f0437d02de24f7e29db3198e861e394c1"

RPROVIDES:${PN} += "libwebkitgtkinjectedbundle.so \
webkitgtk-6-0-injected-bundles"

RDEPENDS:${PN} += "libwebkitgtk-6.0.so.4"

inherit rpm
