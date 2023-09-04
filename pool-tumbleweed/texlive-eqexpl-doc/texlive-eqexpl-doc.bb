SUMMARY = "Documentation for texlive-eqexpl"
DESCRIPTION = "This package includes the documentation for texlive-eqexpl"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.1svn63629"

RPM_NAME = "texlive-eqexpl-doc-2023.209.1.1.1svn63629-54.2.noarch.rpm"
RPM_HASH = "e264a37859d4b56f2118fd869b5fd3604fe57d6f9d4d6a67fb7afecaa7e48f882496f0970dd7de3095838e0984295652d421c4e655324c73e35e0a67195fe92f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-eqexpl-doc-ru \
texlive-eqexpl-doc"

RDEPENDS:${PN} += ""

inherit rpm
