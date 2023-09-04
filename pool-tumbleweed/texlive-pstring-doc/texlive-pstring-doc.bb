SUMMARY = "Documentation for texlive-pstring"
DESCRIPTION = "This package includes the documentation for texlive-pstring"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn42857"

RPM_NAME = "texlive-pstring-doc-2023.209.svn42857-54.2.noarch.rpm"
RPM_HASH = "83f33e7ef11805fdd0bdeefb48a168afc069ac8a0b804ef952b6102305ac9876bd7e1e2505a3eec182fec7dfc195b639b10eacaedd7023ffbbf05244964e0f2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pstring-doc"

RDEPENDS:${PN} += ""

inherit rpm
