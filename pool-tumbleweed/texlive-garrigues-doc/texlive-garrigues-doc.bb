SUMMARY = "Documentation for texlive-garrigues"
DESCRIPTION = "This package includes the documentation for texlive-garrigues"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-garrigues-doc-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "b564b6c4d2aac1b3e3de5c0ce06155bf7eb18f445eb913884a4702e8007edd2defa6f5b1590351bca02ea6a063f20fead17b6d5ea33ec104cb15581adf4bea1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-garrigues-doc"

RDEPENDS:${PN} += ""

inherit rpm
