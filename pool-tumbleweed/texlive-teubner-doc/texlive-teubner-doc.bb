SUMMARY = "Documentation for texlive-teubner"
DESCRIPTION = "This package includes the documentation for texlive-teubner"
LICENSE = "LPPL-1.0"

PV = "2023.201.5.7.3svn64600"

RPM_NAME = "texlive-teubner-doc-2023.201.5.7.3svn64600-54.1.noarch.rpm"
RPM_HASH = "05f073971aa18172932f1afefcccc1f61ed447fa97149743bdcdf785badc53ecff440f205ca770375c1b4e333d965b453a8ee5b8cfc059c9533355d949e3b20c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-teubner-doc"
RDEPENDS:${PN} += ""

inherit rpm
