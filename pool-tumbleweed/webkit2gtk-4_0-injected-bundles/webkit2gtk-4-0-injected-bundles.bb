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

RPM_NAME = "webkit2gtk-4_0-injected-bundles-2.40.3-1.1.aarch64.rpm"
RPM_HASH = "cf4996d023fb5b679aec2de450c45c926ef0cbeee36d226ce99c192b09060bb0915ac0d592ca533b6ff1fc8f106f15d9ff8c2c8107f291e2b2053d78d0d46e0d"

RPROVIDES:${PN} += "libwebkit2gtkinjectedbundle.so \
webkit2gtk-4-0-injected-bundles"

RDEPENDS:${PN} += "libwebkit2gtk-4.0.so.37"

inherit rpm
