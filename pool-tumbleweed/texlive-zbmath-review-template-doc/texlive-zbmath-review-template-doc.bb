SUMMARY = "Documentation for texlive-zbmath-review-template"
DESCRIPTION = "This package includes the documentation for texlive-zbmath-review-template"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2.1svn59693"

RPM_NAME = "texlive-zbmath-review-template-doc-2023.209.2.1svn59693-53.1.noarch.rpm"
RPM_HASH = "96be9799f12ca938a766d0754fbd2ce4ab434f8b7c6fae6690541aed4279159d7b348904b3a33d5714be4928dfd9bea8e94fdc1b9f30c080656207d03b454cf8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zbmath-review-template-doc"

RDEPENDS:${PN} += ""

inherit rpm
