SUMMARY = "Documentation for texlive-haranoaji-extra"
DESCRIPTION = "This package includes the documentation for texlive-haranoaji-extra"
LICENSE = "OFL-1.1"

PV = "2023.209.20230223svn66115"

RPM_NAME = "texlive-haranoaji-extra-doc-2023.209.20230223svn66115-54.2.noarch.rpm"
RPM_HASH = "faf1fb515be94100ecb38c946822a97a6daa3a18106f18afa7c32b2a102085d49deeae3e8627d11f524bdd6857b1f9cb70973d02f2dbbb8537426f14faae085a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-haranoaji-extra-doc"

RDEPENDS:${PN} += ""

inherit rpm
