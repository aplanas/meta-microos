SUMMARY = "Java API to display mathematical formulas written in LaTeX"
DESCRIPTION = "The goal of this Java API is to display mathematical formulas written in LaTeX. \
The default encoding is UTF-8 and most of LaTeX commands are available. \
 \
JLaTeXMath is a fork of the excellent project JMathTeX."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.3"

RPM_NAME = "jlatexmath-1.0.3-6.7.noarch.rpm"
RPM_HASH = "b27ff666dca513f3756c3f47ef2c8b5411b477866966b558bf42f2dbf7fa4d9034c0ddf069cb1c1438d5c771763ae488b7005090fc6f9ef6325ff6ac07069424"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jlatexmath"

RDEPENDS:${PN} += "java \
javapackages-tools"

inherit rpm
