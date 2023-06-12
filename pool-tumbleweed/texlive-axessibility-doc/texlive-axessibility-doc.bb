SUMMARY = "Documentation for texlive-axessibility"
DESCRIPTION = "This package includes the documentation for texlive-axessibility"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.0svn57105"

RPM_NAME = "texlive-axessibility-doc-2023.201.3.0svn57105-53.1.noarch.rpm"
RPM_HASH = "2c278f3ad96cce961e27d5ebd6e737220fa29d65689374712aa8178512e87fe42777798f4ca5cb06ef4fc2a3d2e4400d68b002ec2408bcc317e9180489fed9ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-axessibility-doc"
RDEPENDS:${PN} += ""

inherit rpm
