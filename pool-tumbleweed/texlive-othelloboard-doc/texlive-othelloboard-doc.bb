SUMMARY = "Documentation for texlive-othelloboard"
DESCRIPTION = "This package includes the documentation for texlive-othelloboard"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn23714"

RPM_NAME = "texlive-othelloboard-doc-2023.209.1.2svn23714-55.1.noarch.rpm"
RPM_HASH = "0bdaf872c556684e41912d332ae79aeb11b7ca918f12cd7206f3ebe9ea6c1d4b0bda2261c5d32705a16854eaa79816f8bda812f0474d2c94350bb9bc96058b5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-othelloboard-doc"

RDEPENDS:${PN} += ""

inherit rpm
