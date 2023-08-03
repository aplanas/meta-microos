SUMMARY = "Documentation for texlive-toptesi"
DESCRIPTION = "This package includes the documentation for texlive-toptesi"
LICENSE = "LPPL-1.0"

PV = "2023.209.6.4.06svn56276"

RPM_NAME = "texlive-toptesi-doc-2023.209.6.4.06svn56276-53.1.noarch.rpm"
RPM_HASH = "5e65442e465d4495aada0ed6a3f9585cc4a14c910cc109a5ea86295f8aad8a7e664260dade31e189d948c892d32bbef3e5b325a8b0f44e0f15a81d94b2aa7add"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-toptesi-doc-en;it \
texlive-toptesi-doc"

RDEPENDS:${PN} += ""

inherit rpm
