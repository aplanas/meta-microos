SUMMARY = "Documentation for texlive-cqubeamer"
DESCRIPTION = "This package includes the documentation for texlive-cqubeamer"
LICENSE = "LPPL-1.0"

PV = "2023.204.1.0svn54512"

RPM_NAME = "texlive-cqubeamer-doc-2023.204.1.0svn54512-54.1.noarch.rpm"
RPM_HASH = "0a45c54a1623191cdc31e5513a51d8b339ac165c360b7094a02ddc0464c17300b88be1c0d748f361fd43461f459bae1077594a5f5d6a495b12f9f3540c6e8277"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-cqubeamer-doc-zh \
texlive-cqubeamer-doc"

RDEPENDS:${PN} += ""

inherit rpm
