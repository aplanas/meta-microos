SUMMARY = "Documentation for texlive-xsim"
DESCRIPTION = "This package includes the documentation for texlive-xsim"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.21svn61988"

RPM_NAME = "texlive-xsim-doc-2023.201.0.0.21svn61988-52.1.noarch.rpm"
RPM_HASH = "f48634c47de50514fe6d24acdc72a96275123be39381e6340314d7225c29fda4bc9390cfea57221c92d2727505012fc63cf44e0cf4c14a61a17268d5108e334b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xsim-doc"
RDEPENDS:${PN} += ""

inherit rpm
