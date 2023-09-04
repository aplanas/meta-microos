SUMMARY = "Documentation for texlive-glossaries-italian"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-italian"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn35665"

RPM_NAME = "texlive-glossaries-italian-doc-2023.209.1.0svn35665-54.2.noarch.rpm"
RPM_HASH = "8367e85f1d8499b1ab45ce5897b313ac3470e99b7fe5b0be1a61d7befcdb8ba21e09a0aefcf5b15d3cf27fac7d67b74e3040be57d6c25db6c5b53b1b712394b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-italian-doc"

RDEPENDS:${PN} += ""

inherit rpm
