SUMMARY = "Documentation for texlive-prettyref"
DESCRIPTION = "This package includes the documentation for texlive-prettyref"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.3.0svn15878"

RPM_NAME = "texlive-prettyref-doc-2023.201.3.0svn15878-52.1.noarch.rpm"
RPM_HASH = "4c42d0af72d18e2d17c1d39069f713d170f34f2d0ae37b7711d6886d71af761edc5bb6d28526780535567989284b9d0751ef94e357f16bdfbf87eb4b5f752d27"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-prettyref-doc"

RDEPENDS:${PN} += ""

inherit rpm
