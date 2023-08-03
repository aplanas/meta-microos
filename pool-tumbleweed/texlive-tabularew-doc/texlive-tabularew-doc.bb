SUMMARY = "Documentation for texlive-tabularew"
DESCRIPTION = "This package includes the documentation for texlive-tabularew"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn15878"

RPM_NAME = "texlive-tabularew-doc-2023.209.0.0.1svn15878-55.1.noarch.rpm"
RPM_HASH = "dcf5536265c7dacb7956493a797d633111a12917b0b8ff0669cc7f31a81b9267ae3a873437cc135a6d8b6a124319062e773056ea4962a32ff5001cdd3eec0a84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tabularew-doc"

RDEPENDS:${PN} += ""

inherit rpm
