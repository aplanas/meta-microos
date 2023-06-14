SUMMARY = "Documentation for texlive-rtklage"
DESCRIPTION = "This package includes the documentation for texlive-rtklage"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-rtklage-doc-2023.201.svn15878-53.1.noarch.rpm"
RPM_HASH = "492e6825084eef48ed9efc0992fb20b1012d2ccbb8b15b8afaf338ee00ee95e4c975a48c7d4e8350c7ad7959bc26734706b6b7ea40d4ba202d157e759c90073a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-rtklage-doc-de \
texlive-rtklage-doc"

RDEPENDS:${PN} += ""

inherit rpm
