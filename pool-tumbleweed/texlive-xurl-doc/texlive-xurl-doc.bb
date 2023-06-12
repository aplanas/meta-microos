SUMMARY = "Documentation for texlive-xurl"
DESCRIPTION = "This package includes the documentation for texlive-xurl"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.10svn61553"

RPM_NAME = "texlive-xurl-doc-2023.201.0.0.10svn61553-52.1.noarch.rpm"
RPM_HASH = "6c662f910d861300de77e05a9adbe5674f40e944331e0a332c0193d60c90974e5dacd84a44c773b36bc05d4ebc0836f717379b5985d7856e7ba729a6b3ed6ab9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xurl-doc"
RDEPENDS:${PN} += ""

inherit rpm
