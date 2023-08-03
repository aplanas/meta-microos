SUMMARY = "Documentation for texlive-tikzlings"
DESCRIPTION = "This package includes the documentation for texlive-tikzlings"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn63628"

RPM_NAME = "texlive-tikzlings-doc-2023.209.1.0svn63628-53.1.noarch.rpm"
RPM_HASH = "fa793a0b0f43125c0c18056472acd2e38e533eadc38e0152e3111027f77a905dec1263fcfde8645919e022d52b5abdb4cbe56a371aa4f25c237935ecf780d0b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikzlings-doc"

RDEPENDS:${PN} += ""

inherit rpm
