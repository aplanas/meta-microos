SUMMARY = "Documentation for texlive-smart-eqn"
DESCRIPTION = "This package includes the documentation for texlive-smart-eqn"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn61719"

RPM_NAME = "texlive-smart-eqn-doc-2023.209.1.0svn61719-58.1.noarch.rpm"
RPM_HASH = "02da30c06ea169a4f4da76cc753d4cba7baa0b8d37d0b0b5f7f9756b1ac8ad7f9fe2c50702ab7ae90dfcd33abc41a39eb3059e97b73e4a438cc1298882df77b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-smart-eqn-doc"

RDEPENDS:${PN} += ""

inherit rpm
