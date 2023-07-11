SUMMARY = "Documentation for texlive-quran-de"
DESCRIPTION = "This package includes the documentation for texlive-quran-de"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn54191"

RPM_NAME = "texlive-quran-de-doc-2023.201.0.0.2svn54191-53.2.noarch.rpm"
RPM_HASH = "e54b06b69df6cd2e8d8d821169f4d0b7fbde89870802842e5198c5e51f1f8a4ccefdce1f5be65c92578ec9596e8487f2d10e8667d67d336f9794487a6c328c2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quran-de-doc"

RDEPENDS:${PN} += ""

inherit rpm
