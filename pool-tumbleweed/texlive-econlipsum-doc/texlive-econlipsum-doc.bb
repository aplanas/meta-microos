SUMMARY = "Documentation for texlive-econlipsum"
DESCRIPTION = "This package includes the documentation for texlive-econlipsum"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.8.2svn58390"

RPM_NAME = "texlive-econlipsum-doc-2023.209.0.0.8.2svn58390-54.2.noarch.rpm"
RPM_HASH = "79e0d65acebee1316bf3b1b05dc02d9ed02c636ac7a0fdec778e861849a0ca95cc6e41f4c77305c67cf5f4045f59c9764b2dd351f7144cfdc89595c52ac23115"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-econlipsum-doc"

RDEPENDS:${PN} += ""

inherit rpm
