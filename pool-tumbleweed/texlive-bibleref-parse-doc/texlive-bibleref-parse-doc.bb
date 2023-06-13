SUMMARY = "Documentation for texlive-bibleref-parse"
DESCRIPTION = "This package includes the documentation for texlive-bibleref-parse"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn22054"

RPM_NAME = "texlive-bibleref-parse-doc-2023.201.1.1svn22054-53.1.noarch.rpm"
RPM_HASH = "702754dbcddf84fbd9d6740aef8e9a4a8cf3a3087b6b8bb5bd79cdd81d50b70a316ad033bdda6e9e14861d1512f9c08a51281121da5b89d97dd31f87b994a201"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bibleref-parse-doc"

RDEPENDS:${PN} += ""

inherit rpm
