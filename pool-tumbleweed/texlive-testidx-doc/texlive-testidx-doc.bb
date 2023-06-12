SUMMARY = "Documentation for texlive-testidx"
DESCRIPTION = "This package includes the documentation for texlive-testidx"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn60966"

RPM_NAME = "texlive-testidx-doc-2023.201.1.2svn60966-54.1.noarch.rpm"
RPM_HASH = "40395cdb5420feedca306c727c38492d5ab86bca3d1e7112442b376ae9a674d9ed758ef90d565370a5e6f16651d4378e27ed0f97eac8b2f353b47cf1bc8948d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-testidx-doc"
RDEPENDS:${PN} += ""

inherit rpm
