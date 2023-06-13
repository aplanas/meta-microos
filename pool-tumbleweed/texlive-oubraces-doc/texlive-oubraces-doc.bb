SUMMARY = "Documentation for texlive-oubraces"
DESCRIPTION = "This package includes the documentation for texlive-oubraces"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn21833"

RPM_NAME = "texlive-oubraces-doc-2023.201.svn21833-54.1.noarch.rpm"
RPM_HASH = "8c965b19b7f2e62c9a86923613882cc122cf44e56bd1185e649b6f4786f0ab03fc93d5e1f92865ea5654cc7d1a6d9145583e946e8e382b487a07c49c17e60c77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-oubraces-doc"

RDEPENDS:${PN} += ""

inherit rpm
