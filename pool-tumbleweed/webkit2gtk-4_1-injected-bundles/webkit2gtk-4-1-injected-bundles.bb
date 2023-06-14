SUMMARY = "Injected bundles for webkit2gtk3"
DESCRIPTION = "WebKit is a web content engine, derived from KHTML and KJS from KDE, \
and used primarily in Apple's Safari browser.  It is made to be \
embedded in other applications, such as mail readers, or web browsers. \
 \
It is able to display content such as HTML, SVG, XML, and others. It \
also supports DOM, XMLHttpRequest, XSLT, CSS, Javascript/ECMAscript and \
more."
LICENSE = "BSD-3-Clause & LGPL-2.0-or-later"

PV = "2.40.2"

RPM_NAME = "webkit2gtk-4_1-injected-bundles-2.40.2-1.1.aarch64.rpm"
RPM_HASH = "a249a9f4bf6542e8b71cd7dd5ef08be4b1547ec0cd5979db94be1e646a326897e10c269b99d48ed19f9ba81efe22b9b474cd5ea43f95b7637d576591bcab2299"

RPROVIDES:${PN} += "libwebkit2gtkinjectedbundle.so \
webkit2gtk-4-1-injected-bundles"

RDEPENDS:${PN} += "libwebkit2gtk-4.1.so.0"

inherit rpm
