SUMMARY = "Documentation for texlive-nfssext-cfr"
DESCRIPTION = "This package includes the documentation for texlive-nfssext-cfr"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn43640"

RPM_NAME = "texlive-nfssext-cfr-doc-2023.209.svn43640-55.1.noarch.rpm"
RPM_HASH = "ab30847928d289ad054af1c8e63248ba41a89c5b3a0064fc9028f615dbfc3e6971631dc99a7b2e7051e2364e5eecb9412230f4a24267ff400ed9cab9c0523808"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nfssext-cfr-doc"

RDEPENDS:${PN} += ""

inherit rpm
