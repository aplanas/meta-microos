SUMMARY = "Documentation for texlive-koma-script"
DESCRIPTION = "This package includes the documentation for texlive-koma-script"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.38svn64685"

RPM_NAME = "texlive-koma-script-doc-2023.201.3.38svn64685-55.1.noarch.rpm"
RPM_HASH = "09d76636a4eaa0329166678d16f8be37d18555b78be4fa43d24ab5561a81f9f586ceba272f233a4af739e3be433cb8cb274515c0088068334f1c2a59ef9216a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-koma-script-doc"
RDEPENDS:${PN} += ""

inherit rpm
