SUMMARY = "Documentation for texlive-firamath-otf"
DESCRIPTION = "This package includes the documentation for texlive-firamath-otf"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.03asvn65561"

RPM_NAME = "texlive-firamath-otf-doc-2023.209.0.0.03asvn65561-53.1.noarch.rpm"
RPM_HASH = "2b99bed5056e3e81bf4f12ecdffec53a7d4208775dd5d2a259af78f8550ff5bb8458f313c12689089da08a69207babb76e3582441c2fe0cc378bef715041a7b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-firamath-otf-doc"

RDEPENDS:${PN} += ""

inherit rpm
