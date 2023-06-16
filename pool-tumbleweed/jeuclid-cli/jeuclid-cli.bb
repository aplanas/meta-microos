SUMMARY = "Command line interface for JEuclid"
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
This pacakges provides a command line interface for JEuclid."
LICENSE = "Apache-2.0 & LGPL-2.1-only"

PV = "3.1.9"

RPM_NAME = "jeuclid-cli-3.1.9-2.6.noarch.rpm"
RPM_HASH = "367d7b333a4e857c84d93f51eea8546a35017124de44cb2295dcece1f7c4fb2c7540c91446b58f70ca0b412d1ddbae1a1cc95303e92e6bfd3e840ba9b6e5f69a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jeuclid-cli"

RDEPENDS:${PN} += "/usr/bin/bash \
apache-commons-cli \
apache-commons-io \
apache-commons-lang3 \
jeuclid"

inherit rpm
