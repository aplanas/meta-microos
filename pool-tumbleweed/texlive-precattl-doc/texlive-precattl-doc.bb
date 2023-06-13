SUMMARY = "Documentation for texlive-precattl"
DESCRIPTION = "This package includes the documentation for texlive-precattl"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.0.0svn63967"

RPM_NAME = "texlive-precattl-doc-2023.201.0.0.0.0svn63967-52.1.noarch.rpm"
RPM_HASH = "23fb3c62894f47f635b307ad03f351406fef4ebeadeed876140e614f3f669b59d0b4c8fcbe49ddd90e07580ea1aad9abc669d6d7d0b8dacab619d3392eecb303"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-precattl-doc"

RDEPENDS:${PN} += ""

inherit rpm
