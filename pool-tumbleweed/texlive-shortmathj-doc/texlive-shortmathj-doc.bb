SUMMARY = "Documentation for texlive-shortmathj"
DESCRIPTION = "This package includes the documentation for texlive-shortmathj"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5.0svn54407"

RPM_NAME = "texlive-shortmathj-doc-2023.209.0.0.5.0svn54407-54.1.noarch.rpm"
RPM_HASH = "6bf9fe94e85225bf3adb55e5426ffb45c02a335981042ad636b968e20a60dec49c995728bb9ff1fab9f4fadd3ad297879d7cbfd3afa5d83baf8bde93a16bc649"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-shortmathj-doc"

RDEPENDS:${PN} += ""

inherit rpm
