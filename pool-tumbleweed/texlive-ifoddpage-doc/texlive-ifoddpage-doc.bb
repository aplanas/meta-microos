SUMMARY = "Documentation for texlive-ifoddpage"
DESCRIPTION = "This package includes the documentation for texlive-ifoddpage"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.2svn64967"

RPM_NAME = "texlive-ifoddpage-doc-2023.208.1.2svn64967-53.1.noarch.rpm"
RPM_HASH = "cae5506ee69d009168ea76364df3b91b31d4ed2ad8f9bcb10d883b3a804aa8fc889975647c9800ef5b5a23e45de337ffa09391a8da9a58ad8949d4c654bf658e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ifoddpage-doc"

RDEPENDS:${PN} += ""

inherit rpm
