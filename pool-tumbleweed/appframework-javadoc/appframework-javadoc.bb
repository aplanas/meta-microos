SUMMARY = "Swing Application Framework"
DESCRIPTION = "The JSR-296 Swing Application Framework prototype implementation is a \
small set of Java classes that simplify building desktop applications."
LICENSE = "LGPL-2.0-or-later"

PV = "1.03"

RPM_NAME = "appframework-javadoc-1.03-28.18.noarch.rpm"
RPM_HASH = "9d2416b298d298d1d8a9ce17755c86433c12927821d254fc157f27a9648b09f9e32e33c74d0c37b0e059c04a1cd0b0b31afb5b8f063024e9076a57acb8a22b77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "appframework-javadoc"
RDEPENDS:${PN} += ""

inherit rpm
