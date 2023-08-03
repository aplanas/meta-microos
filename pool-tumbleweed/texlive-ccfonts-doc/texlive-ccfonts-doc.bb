SUMMARY = "Documentation for texlive-ccfonts"
DESCRIPTION = "This package includes the documentation for texlive-ccfonts"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn61431"

RPM_NAME = "texlive-ccfonts-doc-2023.209.svn61431-53.1.noarch.rpm"
RPM_HASH = "4feb1dfefd66aa9af3ade387b4299d9a2d4438606093115d56992679ac882fb34857dad57b3f7972581ff9a137a5aa709e335994e93c294f2ad2d3e9f1ddab18"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ccfonts-doc"

RDEPENDS:${PN} += ""

inherit rpm
