SUMMARY = "Documentation for texlive-foreign"
DESCRIPTION = "This package includes the documentation for texlive-foreign"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.7svn27819"

RPM_NAME = "texlive-foreign-doc-2023.201.2.7svn27819-52.1.noarch.rpm"
RPM_HASH = "2e3a97c9555fd7c1a6f3a3185733bcaf19cec6db6b037409d06eaa9012945bd89d5a0f59a5a953c484a8501d3aad58a00d79f99604b75be363e52456ae612485"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-foreign-doc"
RDEPENDS:${PN} += ""

inherit rpm
