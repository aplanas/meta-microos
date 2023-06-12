SUMMARY = "Documentation for texlive-utfsym"
DESCRIPTION = "This package includes the documentation for texlive-utfsym"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.9.0svn63076"

RPM_NAME = "texlive-utfsym-doc-2023.201.0.0.9.0svn63076-53.1.noarch.rpm"
RPM_HASH = "fbea5a0703090257bd54f668fc27517c4a2b1d44cc10b61745a67cc69ca19ce803a9776335507d2dcd4688f2a5123c1fc4e666b2c82fe34cb3d4d70280917897"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-utfsym-doc:de) \
texlive-utfsym-doc"
RDEPENDS:${PN} += ""

inherit rpm
