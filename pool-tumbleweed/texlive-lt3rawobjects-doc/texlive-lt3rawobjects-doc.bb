SUMMARY = "Documentation for texlive-lt3rawobjects"
DESCRIPTION = "This package includes the documentation for texlive-lt3rawobjects"
LICENSE = "GPL-2.0-or-later"

PV = "2023.208.2.2svn65230"

RPM_NAME = "texlive-lt3rawobjects-doc-2023.208.2.2svn65230-53.1.noarch.rpm"
RPM_HASH = "864167769b848ec93496eeee86ce8d0dbe82a4c0e79468cc517a816900682f37cf7af22fa2575e26bc92eeae8c17fbf101700423a323ddda914fdec576c55689"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lt3rawobjects-doc"

RDEPENDS:${PN} += ""

inherit rpm
