SUMMARY = "Documentation for texlive-calctab"
DESCRIPTION = "This package includes the documentation for texlive-calctab"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.6.1svn15878"

RPM_NAME = "texlive-calctab-doc-2023.209.0.0.6.1svn15878-53.1.noarch.rpm"
RPM_HASH = "d6afb2f3012dd041280aa78d46e381dd26f3c0199770aacb5783d039b3db63e7d51b87e620e572fa7dea2b18d6f61ae8a0821f3df3a6c69495440cfd3d038b96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-calctab-doc"

RDEPENDS:${PN} += ""

inherit rpm
