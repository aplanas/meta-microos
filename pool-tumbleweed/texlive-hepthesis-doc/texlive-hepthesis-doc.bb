SUMMARY = "Documentation for texlive-hepthesis"
DESCRIPTION = "This package includes the documentation for texlive-hepthesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5.2svn46054"

RPM_NAME = "texlive-hepthesis-doc-2023.201.1.5.2svn46054-53.1.noarch.rpm"
RPM_HASH = "c289bb4b5c44b763051000f48bd3670a64e9f5979d9b59132e6c46554b2baa0cb64ddfe6c32f707f636f64b85dd73afaa21a9b9f2d4777b842730101f2de6c92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hepthesis-doc"

RDEPENDS:${PN} += "/bin/bash"

inherit rpm
