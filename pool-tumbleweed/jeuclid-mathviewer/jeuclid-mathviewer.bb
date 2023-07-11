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

RPM_NAME = "jeuclid-mathviewer-3.1.9-2.7.noarch.rpm"
RPM_HASH = "0c3088bd0da298ef44aac0f7f4e22e9bfc41e6dcedeab02acac8e3e6527cab672c7e85e5d6abef1c40f2ed07a4767fd8cd13c7bbc5da8e40323ec11742e460dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jeuclid-mathviewer"

RDEPENDS:${PN} += "/usr/bin/bash \
hicolor-icon-theme \
jeuclid"

inherit rpm
