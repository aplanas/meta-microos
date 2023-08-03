SUMMARY = "Documentation for texlive-chhaya"
DESCRIPTION = "This package includes the documentation for texlive-chhaya"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.4svn61719"

RPM_NAME = "texlive-chhaya-doc-2023.209.0.0.4svn61719-54.1.noarch.rpm"
RPM_HASH = "4f101557b3ace9def03d6e2daa7992c01bc7af81d594fb498a9ff78bf1eb89de58967379a6a63a59b43c1793afdfa44a5fc7c621dd9602aefdeaa79d0c363199"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-chhaya-doc-mr \
texlive-chhaya-doc"

RDEPENDS:${PN} += ""

inherit rpm
