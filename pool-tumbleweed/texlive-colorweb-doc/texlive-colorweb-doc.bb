SUMMARY = "Documentation for texlive-colorweb"
DESCRIPTION = "This package includes the documentation for texlive-colorweb"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn31490"

RPM_NAME = "texlive-colorweb-doc-2023.209.1.3svn31490-54.1.noarch.rpm"
RPM_HASH = "95bcee1c9b4894dc713162df6d8a1bc59ba2a8f56ec38d454daea3dfb7054d60fe4cb7cafc41289b316c084a10b8beddbd9bcdd8d1682c8f2782d4f7e78a3bee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-colorweb-doc"

RDEPENDS:${PN} += ""

inherit rpm
