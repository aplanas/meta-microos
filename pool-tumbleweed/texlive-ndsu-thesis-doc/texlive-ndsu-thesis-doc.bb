SUMMARY = "Documentation for texlive-ndsu-thesis"
DESCRIPTION = "This package includes the documentation for texlive-ndsu-thesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn46639"

RPM_NAME = "texlive-ndsu-thesis-doc-2023.209.svn46639-55.1.noarch.rpm"
RPM_HASH = "5ea3300df8da858490e7138bd5a341441a2aa32248f9fde3a33eb2f85e293284ae2a803a0a7fd429421bb6ed9e020982da4f125f169a03eeb4b1995ec1979efd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ndsu-thesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
