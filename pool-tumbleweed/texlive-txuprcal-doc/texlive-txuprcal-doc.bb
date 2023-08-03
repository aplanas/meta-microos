SUMMARY = "Documentation for texlive-txuprcal"
DESCRIPTION = "This package includes the documentation for texlive-txuprcal"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.00svn43327"

RPM_NAME = "texlive-txuprcal-doc-2023.209.1.00svn43327-53.1.noarch.rpm"
RPM_HASH = "edee09fcf8de0d4c9dbcbe1debad3857841dbb9ccaa90aa44fce32e0603b20a958ec1a47f1c2fe1c990895975055936e0db26050b58746c2bfbb61cb1e49e3db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-txuprcal-doc"

RDEPENDS:${PN} += ""

inherit rpm
