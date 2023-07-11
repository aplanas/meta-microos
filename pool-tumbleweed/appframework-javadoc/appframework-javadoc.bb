SUMMARY = "Swing Application Framework"
DESCRIPTION = "The JSR-296 Swing Application Framework prototype implementation is a \
small set of Java classes that simplify building desktop applications."
LICENSE = "LGPL-2.0-or-later"

PV = "1.03"

RPM_NAME = "appframework-javadoc-1.03-28.19.noarch.rpm"
RPM_HASH = "0fd06a08b14068dd7e76ddd850649aca00ae647c4c41c56b04c9b123e17e191a4511954b174ff08c066d503ad215bc990e5bb0071e4ebcbaa34115bc47d0d2cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "appframework-javadoc"

RDEPENDS:${PN} += ""

inherit rpm
