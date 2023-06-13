SUMMARY = "Documentation for texlive-memoir"
DESCRIPTION = "This package includes the documentation for texlive-memoir"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.7.19svn65040"

RPM_NAME = "texlive-memoir-doc-2023.201.3.7.19svn65040-52.1.noarch.rpm"
RPM_HASH = "913895d12e73331b32b59945207b853116b511b13d806a8c699442e07d35bde12fad520e07e0aef7bfd01206703c6b7bb8d17e62cb91e97998af70e1d1c95a6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-memoir-doc"

RDEPENDS:${PN} += ""

inherit rpm
