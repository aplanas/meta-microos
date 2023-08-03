SUMMARY = "Documentation for texlive-frenchmath"
DESCRIPTION = "This package includes the documentation for texlive-frenchmath"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.6svn66470"

RPM_NAME = "texlive-frenchmath-doc-2023.209.2.6svn66470-53.1.noarch.rpm"
RPM_HASH = "b72d130b0170879b2a0d9fc6c6ec558c5f7408c80649c400bb9a6da53bfc305edc9a707cfff1ae3f629662531dde9ed6e4c4bba84fc2435ea9bb392af44abb54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-frenchmath-doc-fr \
texlive-frenchmath-doc"

RDEPENDS:${PN} += ""

inherit rpm
