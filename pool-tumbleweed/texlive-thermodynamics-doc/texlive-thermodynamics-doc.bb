SUMMARY = "Documentation for texlive-thermodynamics"
DESCRIPTION = "This package includes the documentation for texlive-thermodynamics"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.00svn63188"

RPM_NAME = "texlive-thermodynamics-doc-2023.201.1.00svn63188-54.1.noarch.rpm"
RPM_HASH = "3d0bb30eeffe050f58bec0ee96a094b65f9a7367209b5f2888a6a637096f426b5000260833c4135286b855ef6b72cb04ddedf87484ff45f813ac877e655e2412"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-thermodynamics-doc"

RDEPENDS:${PN} += ""

inherit rpm
