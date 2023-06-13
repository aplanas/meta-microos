SUMMARY = "Documentation for texlive-librebodoni"
DESCRIPTION = "This package includes the documentation for texlive-librebodoni"
LICENSE = "OFL-1.1"

PV = "2023.201.svn64431"

RPM_NAME = "texlive-librebodoni-doc-2023.201.svn64431-54.1.noarch.rpm"
RPM_HASH = "746896a9462dcb32bf347c99921ee90af8e5abcc45bc08f36462a266d00066d7c82e343c0be348fd20c96486d97c9aee9d0e89425fc38938b4b3f220358e01c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-librebodoni-doc"

RDEPENDS:${PN} += ""

inherit rpm
