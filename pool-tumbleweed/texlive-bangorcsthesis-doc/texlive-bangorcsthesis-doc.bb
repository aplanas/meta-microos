SUMMARY = "Documentation for texlive-bangorcsthesis"
DESCRIPTION = "This package includes the documentation for texlive-bangorcsthesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5.5svn61770"

RPM_NAME = "texlive-bangorcsthesis-doc-2023.209.1.5.5svn61770-54.1.noarch.rpm"
RPM_HASH = "893e15f1e3020d46c60f6562e1826c281aad4b33b615ccafc3961c33d070382dd17ec6909571395c01dd95ada32a97135a30fb70a148dd791018edc00bf98240"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bangorcsthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
