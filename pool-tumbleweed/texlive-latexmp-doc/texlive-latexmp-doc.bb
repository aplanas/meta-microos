SUMMARY = "Documentation for texlive-latexmp"
DESCRIPTION = "This package includes the documentation for texlive-latexmp"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.2.1svn55643"

RPM_NAME = "texlive-latexmp-doc-2023.209.1.2.1svn55643-55.1.noarch.rpm"
RPM_HASH = "2257ac076532a400116fabb16a939ffc2419497dfaaf00acb9f0bd7c2bf5bd1418db0caf58c94ab87123361e102d83a1c28dc2d9e93b47afcfbe9573a041d29f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latexmp-doc"

RDEPENDS:${PN} += ""

inherit rpm
