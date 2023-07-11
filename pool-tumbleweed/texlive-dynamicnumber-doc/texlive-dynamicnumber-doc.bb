SUMMARY = "Documentation for texlive-dynamicnumber"
DESCRIPTION = "This package includes the documentation for texlive-dynamicnumber"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.3svn38726"

RPM_NAME = "texlive-dynamicnumber-doc-2023.201.0.0.1.3svn38726-53.2.noarch.rpm"
RPM_HASH = "a877acc68c210d9a59e30a740ed0ad9159629817defee0997cc759c817961bca83fcbc7bdd1bb1fc48be83b0163a4800dad8fc35b62e1d981e4b4c0f497e571f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dynamicnumber-doc"

RDEPENDS:${PN} += ""

inherit rpm
