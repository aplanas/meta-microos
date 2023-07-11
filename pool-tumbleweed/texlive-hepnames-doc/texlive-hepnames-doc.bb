SUMMARY = "Documentation for texlive-hepnames"
DESCRIPTION = "This package includes the documentation for texlive-hepnames"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0svn35722"

RPM_NAME = "texlive-hepnames-doc-2023.201.2.0svn35722-53.2.noarch.rpm"
RPM_HASH = "a3066578511fe86d1d01c49443aec41e6a50848deee68b9d9a2a7dbbf0f842292fca8c9b217e392bf80cfee6f987f21f8dbb673971752c8924266f7bb331d2c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hepnames-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
