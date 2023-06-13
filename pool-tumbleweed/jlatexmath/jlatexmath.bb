SUMMARY = "Java API to display mathematical formulas written in LaTeX"
DESCRIPTION = "The goal of this Java API is to display mathematical formulas written in LaTeX. \
The default encoding is UTF-8 and most of LaTeX commands are available. \
 \
JLaTeXMath is a fork of the excellent project JMathTeX."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.3"

RPM_NAME = "jlatexmath-1.0.3-6.6.noarch.rpm"
RPM_HASH = "119ad8f89bea4514d2e8d68bb4b2bc688b6c99235f089e86381ce811e415c2c4e35b5bb0ea9acb26e36f12ef79d196ccded5edb3e98458ecaf0db86ecc9d4a9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jlatexmath"

RDEPENDS:${PN} += "java \
javapackages-tools"

inherit rpm
