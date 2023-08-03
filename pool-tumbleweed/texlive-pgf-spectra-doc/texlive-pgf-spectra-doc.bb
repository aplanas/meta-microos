SUMMARY = "Documentation for texlive-pgf-spectra"
DESCRIPTION = "This package includes the documentation for texlive-pgf-spectra"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2.0svn66011"

RPM_NAME = "texlive-pgf-spectra-doc-2023.209.2.2.0svn66011-52.1.noarch.rpm"
RPM_HASH = "0982de36eb5b32df4f3c2d81d7c14705a17f62733cf7d9c660ff9c6a13bc87143f0c71515f8c36059e5cc8728ece2882db586eb2b4b4183bd6c65261d6e70185"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pgf-spectra-doc"

RDEPENDS:${PN} += ""

inherit rpm
