SUMMARY = "Documentation for texlive-pst-arrow"
DESCRIPTION = "This package includes the documentation for texlive-pst-arrow"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.05svn61069"

RPM_NAME = "texlive-pst-arrow-doc-2023.209.0.0.05svn61069-53.1.noarch.rpm"
RPM_HASH = "c60a880a100788e51dd05bc7061a2b18cd03dcf909441fa6eaad997a96471c347ec019cafdaa520fbfb84c279fa6ab35a1dba6764e2bff1ab65e2912162bd8ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-arrow-doc"

RDEPENDS:${PN} += ""

inherit rpm
