SUMMARY = "Documentation for texlive-ksp-thesis"
DESCRIPTION = "This package includes the documentation for texlive-ksp-thesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.2svn39080"

RPM_NAME = "texlive-ksp-thesis-doc-2023.209.1.0.2svn39080-56.1.noarch.rpm"
RPM_HASH = "65a626b7713cb98b6bbde113d24e5ca2e9426b3b0af563447c75567b751e27cbc6dd7a41702af5f99e8c86c558b9479bee055ca98d48676d307bdcafe3af2dee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ksp-thesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
