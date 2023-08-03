SUMMARY = "Documentation for texlive-romanbarpagenumber"
DESCRIPTION = "This package includes the documentation for texlive-romanbarpagenumber"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn36236"

RPM_NAME = "texlive-romanbarpagenumber-doc-2023.209.1.0svn36236-54.1.noarch.rpm"
RPM_HASH = "3d96b4de809b8549b88ba0cee580062e240e852c470726c0df531771430566865af2187ec6cadf79f8a5a39af95aa5309d9a203fb49eb8c3a90c90125e79e813"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-romanbarpagenumber-doc"

RDEPENDS:${PN} += ""

inherit rpm
