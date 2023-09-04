SUMMARY = "Documentation for texlive-epiolmec"
DESCRIPTION = "This package includes the documentation for texlive-epiolmec"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-epiolmec-doc-2023.209.svn15878-54.2.noarch.rpm"
RPM_HASH = "27fe6999dca33d28eb0d457c03ab34c24cd2297463bf186c37704ab509d968dd49fc7d3ed12ea35e3439558f502dc6f0ad4fd16e5f6c2b51fe9a108bd5c0577f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epiolmec-doc"

RDEPENDS:${PN} += ""

inherit rpm
