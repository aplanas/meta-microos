SUMMARY = "Documentation for texlive-currency"
DESCRIPTION = "This package includes the documentation for texlive-currency"
LICENSE = "LPPL-1.0"

PV = "2023.204.0.0.4svn48990"

RPM_NAME = "texlive-currency-doc-2023.204.0.0.4svn48990-54.1.noarch.rpm"
RPM_HASH = "7a0dbed51483ea61498ec98d28dd6b05040008bb697135d6ba4caec5954af1d558e3c32f4d827894dafc8e20f27047463a18bcd664df581dd727d2cd2f08f519"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-currency-doc"

RDEPENDS:${PN} += ""

inherit rpm
