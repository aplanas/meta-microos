SUMMARY = "Documentation for texlive-tikzbricks"
DESCRIPTION = "This package includes the documentation for texlive-tikzbricks"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4svn63952"

RPM_NAME = "texlive-tikzbricks-doc-2023.201.0.0.4svn63952-52.1.noarch.rpm"
RPM_HASH = "e345e9fcc0256e95a232ddaf119055646c42b510e227899ea50f51ff257ae8ebcea34603e6edfd030b64424af1e12b8b5320e123e37a73343917c3263e2efb71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikzbricks-doc"
RDEPENDS:${PN} += ""

inherit rpm
