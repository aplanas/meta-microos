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

RPM_NAME = "jeuclid-fop-3.1.9-2.7.noarch.rpm"
RPM_HASH = "1c09f4e9f2c51d154c606184ada8d1158cd78793b0db65c867c4cc353018684c30ad6420831caadacaab0a69980b1d71827c6fadf16934a26f546702bc2f60da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jeuclid-fop"

RDEPENDS:${PN} += "jeuclid \
xmlgraphics-fop"

inherit rpm
