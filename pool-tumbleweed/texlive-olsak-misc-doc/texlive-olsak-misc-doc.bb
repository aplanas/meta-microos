SUMMARY = "Documentation for texlive-olsak-misc"
DESCRIPTION = "This package includes the documentation for texlive-olsak-misc"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.aug._2022svn65631"

RPM_NAME = "texlive-olsak-misc-doc-2023.209.aug._2022svn65631-55.1.noarch.rpm"
RPM_HASH = "54a031707ef8f7400589ede3b2cc886ed119a8b629cb243b70a952b3bc0bbdfa79bfdaab01f872c12708421838b9d595e864bea152eccced9461408b521d2a04"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-olsak-misc-doc"

RDEPENDS:${PN} += ""

inherit rpm
