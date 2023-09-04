SUMMARY = "Documentation for texlive-endnotesj"
DESCRIPTION = "This package includes the documentation for texlive-endnotesj"
LICENSE = "BSD-3-Clause"

PV = "2023.209.3.0svn47703"

RPM_NAME = "texlive-endnotesj-doc-2023.209.3.0svn47703-54.2.noarch.rpm"
RPM_HASH = "08fb82c4c4fca417a9e9239f3755066be8f85884da142121899354726abd87b8deb2768bf8118d1f58092ec4ac9bd910908f2b119ae38e62b68b608edc919471"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-endnotesj-doc-ja \
texlive-endnotesj-doc"

RDEPENDS:${PN} += ""

inherit rpm
