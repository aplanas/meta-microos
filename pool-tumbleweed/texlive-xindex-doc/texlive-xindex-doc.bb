SUMMARY = "Documentation for texlive-xindex"
DESCRIPTION = "This package includes the documentation for texlive-xindex"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.47svn65597"

RPM_NAME = "texlive-xindex-doc-2023.209.0.0.47svn65597-53.2.noarch.rpm"
RPM_HASH = "51d0fcac05fe753eee0cf03c45ddd6d6b1b03af0ad4c00ba7839dc078eb7403349543800841c8da17d474f5eb6ecc422a8ce561b2ca0f4b571874691038bf037"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xindex-doc"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
