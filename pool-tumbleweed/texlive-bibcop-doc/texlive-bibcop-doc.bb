SUMMARY = "Documentation for texlive-bibcop"
DESCRIPTION = "This package includes the documentation for texlive-bibcop"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.0.9svn65816"

RPM_NAME = "texlive-bibcop-doc-2023.209.0.0.0.9svn65816-54.1.noarch.rpm"
RPM_HASH = "41d9b09b5202c5a809c257192eae4917b0861872ef0a948e441e69f5bfde08a7df7d75ad2e270b7132bab63fdf285e5aa7846e1871d068ec30926cc764d75f42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-bibcop.1 \
texlive-bibcop-doc"

RDEPENDS:${PN} += ""

inherit rpm
