SUMMARY = "Documentation for texlive-mpcolornames"
DESCRIPTION = "This package includes the documentation for texlive-mpcolornames"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.20svn23252"

RPM_NAME = "texlive-mpcolornames-doc-2023.209.0.0.20svn23252-55.1.noarch.rpm"
RPM_HASH = "6329824410eed3c0a0fe611c48bc53a589bdb71b67abc4d7311cb004c694e18e6c5a67bac02400110098fcf34a0ed255c4977f663349b66da3db4cb97174081b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mpcolornames-doc"

RDEPENDS:${PN} += ""

inherit rpm
