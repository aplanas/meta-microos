SUMMARY = "Documentation for texlive-hepparticles"
DESCRIPTION = "This package includes the documentation for texlive-hepparticles"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0svn35723"

RPM_NAME = "texlive-hepparticles-doc-2023.209.2.0svn35723-54.1.noarch.rpm"
RPM_HASH = "1d2a8a739412ea659e92ae83a581b5dae1a6be6821acd166198b61caa9a3355f89b6d70d171631c19763325da141aa10f1ecacda3f7e20893b7e3102a4ea8ef2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hepparticles-doc"

RDEPENDS:${PN} += ""

inherit rpm
