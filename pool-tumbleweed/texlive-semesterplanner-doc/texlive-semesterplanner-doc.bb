SUMMARY = "Documentation for texlive-semesterplanner"
DESCRIPTION = "This package includes the documentation for texlive-semesterplanner"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn56841"

RPM_NAME = "texlive-semesterplanner-doc-2023.209.1.0svn56841-54.1.noarch.rpm"
RPM_HASH = "1eeccde396032acee9000ab0a823d3f30cacaa83b62684e9669c58bff4e178f0138b0c0a30d0a3af8f30d30367a699c4bc6053328aa03b4588ea56ecdb19645d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-semesterplanner-doc"

RDEPENDS:${PN} += ""

inherit rpm
