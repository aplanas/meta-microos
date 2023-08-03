SUMMARY = "Documentation for texlive-biblatex-license"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-license"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn58437"

RPM_NAME = "texlive-biblatex-license-doc-2023.209.0.0.1svn58437-54.1.noarch.rpm"
RPM_HASH = "850183a99300594b5e78886f6a15b04f48b465d52bd95808c2f54ae7144f4b8eb683a8bfe0760cb8f17831100705dc06d6283419f4c01ed74b4cf6ebedc8d520"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-license-doc"

RDEPENDS:${PN} += ""

inherit rpm
