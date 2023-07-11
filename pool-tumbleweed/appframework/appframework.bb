SUMMARY = "Swing Application Framework"
DESCRIPTION = "The JSR-296 Swing Application Framework prototype implementation is a \
small set of Java classes that simplify building desktop applications."
LICENSE = "LGPL-2.0-or-later"

PV = "1.03"

RPM_NAME = "appframework-1.03-28.19.noarch.rpm"
RPM_HASH = "805da9960b0ddde39d4f1feac275e2b70ea1ecfdaf6a6cf944260cdf2aa848b9fe6b82e345a6e67b9745f1ec5c9e9bb03100040710253606a2777444f10e8c11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "appframework"

RDEPENDS:${PN} += "java \
swing-layout"

inherit rpm
