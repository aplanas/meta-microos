SUMMARY = "Documentation for texlive-hep"
DESCRIPTION = "This package includes the documentation for texlive-hep"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-hep-doc-2023.209.1.0svn15878-54.1.noarch.rpm"
RPM_HASH = "331b95235d0bf0012d44347a3f29006c3cc27595b051ef7a3742e7e974019891b17535bfec47cf0b090ab555cebc44452911293488c2ad66fdb3c54e9399937f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hep-doc"

RDEPENDS:${PN} += ""

inherit rpm
