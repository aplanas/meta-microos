SUMMARY = "Documentation for texlive-latex2man"
DESCRIPTION = "This package includes the documentation for texlive-latex2man"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.29svn64477"

RPM_NAME = "texlive-latex2man-doc-2023.209.1.29svn64477-55.1.noarch.rpm"
RPM_HASH = "e9544e7cd93b5b3c37f58ff672d6edcb5885828bdf2c642b218f23fef33795c601ebab8f11b25b74a2d7566ccae04d73e56d2289a4ade95be0116f50629ec1c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-latex2man.1 \
texlive-latex2man-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
