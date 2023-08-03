SUMMARY = "Documentation for texlive-mfpic"
DESCRIPTION = "This package includes the documentation for texlive-mfpic"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.10svn28444"

RPM_NAME = "texlive-mfpic-doc-2023.209.1.10svn28444-55.1.noarch.rpm"
RPM_HASH = "d690467da8988bea3e985f510aa9ede2675eb3bba8e1f09d07557e12e0e6454287ed02a612ba298de1aab52680873e5ccd21fedf3ea5bf940df6ae997f24d46a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-mfpic-doc-en \
texlive-mfpic-doc"

RDEPENDS:${PN} += ""

inherit rpm
