SUMMARY = "Documentation for texlive-luaoptions"
DESCRIPTION = "This package includes the documentation for texlive-luaoptions"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.8svn64870"

RPM_NAME = "texlive-luaoptions-doc-2023.208.0.0.8svn64870-53.1.noarch.rpm"
RPM_HASH = "16085eafc91e7bed3d404f2193f7b375cdaa0cf662fbb64e9081fa915577eb6b4b868d2aac729c0efb7da490509f5fb2e512b62ec9641c6403ec22e8c218761a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luaoptions-doc"

RDEPENDS:${PN} += ""

inherit rpm
