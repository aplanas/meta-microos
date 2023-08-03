SUMMARY = "Documentation for texlive-pst-dbicons"
DESCRIPTION = "This package includes the documentation for texlive-pst-dbicons"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.16svn17556"

RPM_NAME = "texlive-pst-dbicons-doc-2023.209.0.0.16svn17556-53.1.noarch.rpm"
RPM_HASH = "66cbb7d5b172a923303ef81e63b7e0226fe87fe38c9278489c4d211dc042f60c134877e9938d1b6c63531d78cb21c10b3286e276506eb8128473d6a9323e4a86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-dbicons-doc"

RDEPENDS:${PN} += ""

inherit rpm
