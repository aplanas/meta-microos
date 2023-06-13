SUMMARY = "JEuclid plug-in for FOP"
DESCRIPTION = "JEuclid is a complete MathML rendering solution, consisting of: \
 \
    A MathViewer application \
    Command line converters from MathML to other formats \
    An ant task for automated conversion \
    Display components for AWT, Swing, and SWT \
 \
JEuclid features: \
 \
    Almost complete support for presentation MathML 2.0 \
    Basic support for content MathML 2.0 \
    Initial support for the upcoming MathML 3.0 \
 \
This pacakges contains a JEuclid plug-in for \
FOP (Formatting Objects Processor)."
LICENSE = "Apache-2.0 & LGPL-2.1-only"

PV = "3.1.9"

RPM_NAME = "jeuclid-fop-3.1.9-2.6.noarch.rpm"
RPM_HASH = "be28e6efaea0fe951ea15b1af732290d2258f157d8ee3d5e683f7a78510d1849f7d74c20da4253517299591a9242f0bb0da7a2fcf2fe8961f00096d69b648f2b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jeuclid-fop"

RDEPENDS:${PN} += "jeuclid \
xmlgraphics-fop"

inherit rpm
