SUMMARY = "Documentation for texlive-interchar"
DESCRIPTION = "This package includes the documentation for texlive-interchar"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn36312"

RPM_NAME = "texlive-interchar-doc-2023.209.0.0.2svn36312-54.1.noarch.rpm"
RPM_HASH = "c6d24befeef2698984303c2374433e19aa33fc858ac1fcf066ea37c2affa4ab3de6e0fa3262448811b33352732b30f87637e8ba75fb794d910fb3f2bc7c9a3b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-interchar-doc"

RDEPENDS:${PN} += ""

inherit rpm
