SUMMARY = "Documentation for texlive-ftc-notebook"
DESCRIPTION = "This package includes the documentation for texlive-ftc-notebook"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn50043"

RPM_NAME = "texlive-ftc-notebook-doc-2023.209.1.1svn50043-53.1.noarch.rpm"
RPM_HASH = "2b94f0a1886a14afa9e7b474064ff5f9d6334343c189d4330cb4893a16729c63415b574aa31eaf3e8cb022121024851a12580cec29fa9401b554af7ee92dab43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ftc-notebook-doc"

RDEPENDS:${PN} += ""

inherit rpm
