SUMMARY = "Documentation for texlive-atkinson"
DESCRIPTION = "This package includes the documentation for texlive-atkinson"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn64385"

RPM_NAME = "texlive-atkinson-doc-2023.209.svn64385-54.1.noarch.rpm"
RPM_HASH = "aef6ecfe662ff9e2f115bd1232594582d4e4fe23b860088bfd63487c3faaee37bd3283d8d7336c9344a49e72d67dcab9d075ce689e70250b5c4b6be0793f41ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-atkinson-doc"

RDEPENDS:${PN} += ""

inherit rpm
