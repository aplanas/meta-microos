SUMMARY = "Documentation for texlive-lectureslides"
DESCRIPTION = "This package includes the documentation for texlive-lectureslides"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn62292"

RPM_NAME = "texlive-lectureslides-doc-2023.209.1.0svn62292-55.1.noarch.rpm"
RPM_HASH = "a875ce179c95331014099e3da0e1d1c905857f9a2a5aa3c95fedf68204a808009da22a780fbe3cdd60d5b931fb4e4cb90fa0d199d854ae7cd8defef27791f7e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lectureslides-doc"

RDEPENDS:${PN} += ""

inherit rpm
