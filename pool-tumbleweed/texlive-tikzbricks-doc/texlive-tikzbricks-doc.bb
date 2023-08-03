SUMMARY = "Documentation for texlive-tikzbricks"
DESCRIPTION = "This package includes the documentation for texlive-tikzbricks"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4svn63952"

RPM_NAME = "texlive-tikzbricks-doc-2023.209.0.0.4svn63952-53.1.noarch.rpm"
RPM_HASH = "f3fae893b87ec7ef963fc850964c6dc7c3402b3d347cccf5c99a901bc9183a8d8ece85d0aa78a6f5ae7f0fdc6bf9bc0872a452ba53714793f160b91d6a3aa05d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikzbricks-doc"

RDEPENDS:${PN} += ""

inherit rpm
