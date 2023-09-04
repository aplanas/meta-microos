SUMMARY = "Documentation for texlive-hepparticles"
DESCRIPTION = "This package includes the documentation for texlive-hepparticles"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn35723"

RPM_NAME = "texlive-hepparticles-doc-2023.209.2.0svn35723-54.2.noarch.rpm"
RPM_HASH = "5c9274e4978007396705ae4c26d60c80cc7d494168d464f6c4e85da2b269c3ec1fdbcabb4919a0bc45225a6d395d5ef74e6b7ad994e6c35ec12913c05ecdeaa8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hepparticles-doc"

RDEPENDS:${PN} += ""

inherit rpm
