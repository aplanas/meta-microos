SUMMARY = "Documentation for texlive-capt-of"
DESCRIPTION = "This package includes the documentation for texlive-capt-of"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn29803"

RPM_NAME = "texlive-capt-of-doc-2023.209.svn29803-53.1.noarch.rpm"
RPM_HASH = "12f0117a784c838d57d1f2de6512a8d76b8675f1faf50cc0a220b908028882bb3ba53f5cbee85faee4205b93974d8a151a29a952c07151945a0d49b773bd3ee7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-capt-of-doc"

RDEPENDS:${PN} += ""

inherit rpm
