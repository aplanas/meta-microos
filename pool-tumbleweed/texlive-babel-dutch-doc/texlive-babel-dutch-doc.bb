SUMMARY = "Documentation for texlive-babel-dutch"
DESCRIPTION = "This package includes the documentation for texlive-babel-dutch"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.8lsvn60362"

RPM_NAME = "texlive-babel-dutch-doc-2023.209.3.8lsvn60362-54.1.noarch.rpm"
RPM_HASH = "9af038959456bb79202ef6749586b0cb4c81013331cfe75d70118346e3904133cf7694f1e5c398109346e4c74480dcd946cfbbb6eb3ab9b7794e018a6faa2a9d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-babel-dutch-doc"

RDEPENDS:${PN} += ""

inherit rpm
