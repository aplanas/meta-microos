SUMMARY = "Documentation for texlive-hardwrap"
DESCRIPTION = "This package includes the documentation for texlive-hardwrap"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn21396"

RPM_NAME = "texlive-hardwrap-doc-2023.209.0.0.2svn21396-54.2.noarch.rpm"
RPM_HASH = "f3f29c0956d7d8ccedfe49436c4df4593b3b04f92f21209a147e936753d49bb65b1b29fc7252d86018e961029150055dfc324fd9f1bd2fe7d2d9a07d91859ee7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hardwrap-doc"

RDEPENDS:${PN} += ""

inherit rpm
