SUMMARY = "Documentation for texlive-coordsys"
DESCRIPTION = "This package includes the documentation for texlive-coordsys"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn15878"

RPM_NAME = "texlive-coordsys-doc-2023.209.1.4svn15878-55.1.noarch.rpm"
RPM_HASH = "2c051c04dce1868a8f468ee9ce1e61ba8da51ea6595a940c6f45d92bb1314d75c9296fc33875cfdbefc79c36e7fda1439cac2bd33ba7a94620fe66f4c218161c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-coordsys-doc"

RDEPENDS:${PN} += ""

inherit rpm
