SUMMARY = "Documentation for texlive-cclicenses"
DESCRIPTION = "This package includes the documentation for texlive-cclicenses"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-cclicenses-doc-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "9165cd9d6e261d53f92ac995ff13d1f56e896a12f5070aa91a4e8be8e707af00f63184aaac7b4d0fdec0d4481976437c192e05439f9dc9f0a1e55f2ac2576595"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cclicenses-doc"

RDEPENDS:${PN} += ""

inherit rpm
