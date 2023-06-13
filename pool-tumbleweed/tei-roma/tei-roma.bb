SUMMARY = "TEI Schema or DTD Generator"
DESCRIPTION = "Roma is a shell script and XSL stylesheets for building a customized \
TEI schema or DTD.  It uses xsltproc, trang, and Perl."
LICENSE = "GPL-2.0+"

PV = "2.11"

RPM_NAME = "tei-roma-2.11-79.14.noarch.rpm"
RPM_HASH = "429af9c092bda652e9ee8f2ea0673ba27efda9145d36c8087f49964e2558abbe1c82275543f65939657c53e18632cfdf868ccae09fed0b35e51c002dfd0c7d94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tei-roma"

RDEPENDS:${PN} += "/bin/bash \
/usr/bin/xsltproc \
perl \
trang"

inherit rpm
