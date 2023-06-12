SUMMARY = "Viewer for MathML files"
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
This pacakges contains the Swing MathViewer application."
LICENSE = "Apache-2.0 & LGPL-2.1-only"

PV = "3.1.9"

RPM_NAME = "jeuclid-mathviewer-3.1.9-2.6.noarch.rpm"
RPM_HASH = "803d1e177c597dc8f5c5d2150778e839f68d33df3d142f71f46e0989596701eda03457e6d6bbfbab8e11d022ec01f44c9793f79d98e971b7bf726fb9ca2561aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "application() \
application(jeuclid-mathviewer.desktop) \
jeuclid-mathviewer"
RDEPENDS:${PN} += "/bin/bash \
hicolor-icon-theme \
jeuclid"

inherit rpm
