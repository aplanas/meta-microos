SUMMARY = "Documentation for texlive-carlisle"
DESCRIPTION = "This package includes the documentation for texlive-carlisle"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn59577"

RPM_NAME = "texlive-carlisle-doc-2023.209.svn59577-53.1.noarch.rpm"
RPM_HASH = "d962b8c5b0938bc59cd93edfd13c7608da52dbab0534fac9e0c301049d306dbbc15dc94b651de8bedc6cddeab9cb47d33e40486f68b79df8221c978a6fe64aa8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-carlisle-doc"

RDEPENDS:${PN} += ""

inherit rpm
