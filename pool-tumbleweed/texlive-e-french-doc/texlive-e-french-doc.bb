SUMMARY = "Documentation for texlive-e-french"
DESCRIPTION = "This package includes the documentation for texlive-e-french"
LICENSE = "LPPL-1.0"

PV = "2023.209.6.11svn52027"

RPM_NAME = "texlive-e-french-doc-2023.209.6.11svn52027-54.2.noarch.rpm"
RPM_HASH = "06315216c4c1652d0b1b46c0ad5504f683ccb064e4ca13fb95eb3cd360860c2e62511c6e8e39eeb1c6202aec80a2abfe89cff8b14f8c08e2b5c6e0af51081b88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-e-french-doc-en;fr \
texlive-e-french-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
