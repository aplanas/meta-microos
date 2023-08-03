SUMMARY = "Documentation for texlive-ducksay"
DESCRIPTION = "This package includes the documentation for texlive-ducksay"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.6svn64655"

RPM_NAME = "texlive-ducksay-doc-2023.209.2.6svn64655-53.1.noarch.rpm"
RPM_HASH = "65d8f37950af7c9862b10731db0f386d2d9eb243401864a689fe1e7029098f01b50545e368973ec447cd9b7ecc3e42d336d46d3617dde83bff8f9b93aa30795e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ducksay-doc"

RDEPENDS:${PN} += ""

inherit rpm
