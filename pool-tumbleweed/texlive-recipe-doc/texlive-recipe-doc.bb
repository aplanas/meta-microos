SUMMARY = "Documentation for texlive-recipe"
DESCRIPTION = "This package includes the documentation for texlive-recipe"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.0.0.9svn54080"

RPM_NAME = "texlive-recipe-doc-2023.209.0.0.9svn54080-54.1.noarch.rpm"
RPM_HASH = "8a660db2456f54a7ae0549bffd0705a8a8f11f53a5b196907408726730e4e2e09a21cd3dac9f73ece7afae7b372119eef317d62661402bed3db7de5c7ded0971"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-recipe-doc-it \
texlive-recipe-doc"

RDEPENDS:${PN} += ""

inherit rpm
