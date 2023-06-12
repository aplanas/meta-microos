SUMMARY = "Documentation for texlive-scratch"
DESCRIPTION = "This package includes the documentation for texlive-scratch"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.41svn50073"

RPM_NAME = "texlive-scratch-doc-2023.201.0.0.41svn50073-53.1.noarch.rpm"
RPM_HASH = "616e300a229dcfdd7ab6e4f25f7e2af76d1b5423ff4b629ad3f11f1fd57d49be4670ab085602719fb28b4f028497619b87285a1e0991a7b22d6d3e0ef1706307"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-scratch-doc:fr) \
texlive-scratch-doc"
RDEPENDS:${PN} += ""

inherit rpm
