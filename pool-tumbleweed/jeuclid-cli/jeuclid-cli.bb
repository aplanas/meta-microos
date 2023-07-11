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

RPM_NAME = "jeuclid-cli-3.1.9-2.7.noarch.rpm"
RPM_HASH = "8c23ae0dd8510148a829d4a7a62a8ca4561feed0d4f4e47a41c61732147608cb8e3c6718ce1d4f8ccd84d8dfa7c3815b644d68c0ba8bd3b60895e6d49b60a33e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jeuclid-cli"

RDEPENDS:${PN} += "/usr/bin/bash \
apache-commons-cli \
apache-commons-io \
apache-commons-lang3 \
jeuclid"

inherit rpm
