SUMMARY = "Documentation for texlive-typoaid"
DESCRIPTION = "This package includes the documentation for texlive-typoaid"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4.7svn44238"

RPM_NAME = "texlive-typoaid-doc-2023.209.0.0.4.7svn44238-53.1.noarch.rpm"
RPM_HASH = "384cb9d45512208e41e3183a2a2a16f640be45d1dddb5df9fce1e298fc5da1d98438d5573d7caf993e2fb4161f9a27e525cb8fb0a8c902d14ec22b031ab3865b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-typoaid-doc"

RDEPENDS:${PN} += ""

inherit rpm
