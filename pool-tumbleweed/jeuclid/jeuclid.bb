SUMMARY = "MathML rendering solution"
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
This pacakges contains the core module containing basic JEuclid \
rendering and document handling classes."
LICENSE = "Apache-2.0 & LGPL-2.1-only"

PV = "3.1.9"

RPM_NAME = "jeuclid-3.1.9-2.7.noarch.rpm"
RPM_HASH = "ace5fb762e95c411002d8ac1000ac90923fb67c1a1c70f7741041d27543c01b5498e4a06965441baf18016fe31e2e9c657fe5973f0b4e9fe96d1bf916b154855"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jeuclid"

RDEPENDS:${PN} += "/usr/bin/sh \
apache-commons-logging \
batik \
java \
javapackages-tools \
jcip-annotations \
xmlgraphics-commons"

inherit rpm
