SUMMARY = "Qt 5 API Documentation in HTML format"
DESCRIPTION = "This package contains the Qt API documentation in html format."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "5.15.9"

RPM_NAME = "libqt5-qtdoc-html-5.15.9-2.1.noarch.rpm"
RPM_HASH = "9ccfb403cc6e245e7a6b993e6b13132811c0074b640f0906ebdfd360d3350d38bd6c56b17afe5380b3618e8899ce597c4c3ae06b68b604f66388cc2a541c6177"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtdoc-html"

RDEPENDS:${PN} += ""

inherit rpm
