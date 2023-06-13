SUMMARY = "Documentation for texlive-prtec"
DESCRIPTION = "This package includes the documentation for texlive-prtec"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.06svn51919"

RPM_NAME = "texlive-prtec-doc-2023.201.1.06svn51919-52.1.noarch.rpm"
RPM_HASH = "69eb1790123f5a3d4d588e112be094870085b511494b70ebd9adeb5cd677611b113a228f345e9c7215b93285f330e4f7a4d16694a08b2e41baf149244d41ad00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-prtec-doc"

RDEPENDS:${PN} += ""

inherit rpm
