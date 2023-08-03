SUMMARY = "Documentation for texlive-zztex"
DESCRIPTION = "This package includes the documentation for texlive-zztex"
LICENSE = "LPPL-1.0"

PV = "2023.209.17.7svn55862"

RPM_NAME = "texlive-zztex-doc-2023.209.17.7svn55862-53.1.noarch.rpm"
RPM_HASH = "a21a4e9a24e14b9ced064fe25eac6206585d7a9d489cda59c8a51d33d0b569c29f0115eeff98db40c46ecacbd27aec7eb70ace50d696928dad77079ad43630a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zztex-doc"

RDEPENDS:${PN} += ""

inherit rpm
