SUMMARY = "Documentation for texlive-formation-latex-ul"
DESCRIPTION = "This package includes the documentation for texlive-formation-latex-ul"
LICENSE = "LPPL-1.0"

PV = "2023.209.2020.10svn56714"

RPM_NAME = "texlive-formation-latex-ul-doc-2023.209.2020.10svn56714-53.1.noarch.rpm"
RPM_HASH = "a2b95bc8e786ed1e5a7f1571520680963144994e10fa63b3fb57cf10c38ad89b39f8a12a9fe88db9e5a09cc0cab00795c7f917e6bf439d52cefda0f935409f6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-formation-latex-ul-doc-fr \
texlive-formation-latex-ul-doc"

RDEPENDS:${PN} += ""

inherit rpm
