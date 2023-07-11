SUMMARY = "Documentation for texlive-mailmerge"
DESCRIPTION = "This package includes the documentation for texlive-mailmerge"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.0svn15878"

RPM_NAME = "texlive-mailmerge-doc-2023.208.1.0svn15878-53.1.noarch.rpm"
RPM_HASH = "804c96dd6594086726262a278982e3d9e521b9db6bf90478ab9e147c7976d76e8cbeae5e7544ab34184a243b7238d52856e6053dc903e87f0f5cebbefef9c6b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mailmerge-doc"

RDEPENDS:${PN} += ""

inherit rpm
