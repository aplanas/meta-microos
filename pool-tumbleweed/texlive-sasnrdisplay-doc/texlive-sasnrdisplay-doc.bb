SUMMARY = "Documentation for texlive-sasnrdisplay"
DESCRIPTION = "This package includes the documentation for texlive-sasnrdisplay"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.95svn63255"

RPM_NAME = "texlive-sasnrdisplay-doc-2023.209.0.0.95svn63255-54.1.noarch.rpm"
RPM_HASH = "e1174cfaafa46028cc36632012a05068a9e4098ef6f9c92321c68058a49f4f3e43cdca5f2c3e930e349681208c5cbfb2dfd1a17a71a484b5b220fa42954c0b7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sasnrdisplay-doc"

RDEPENDS:${PN} += ""

inherit rpm
