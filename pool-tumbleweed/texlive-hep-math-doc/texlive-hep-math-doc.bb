SUMMARY = "Documentation for texlive-hep-math"
DESCRIPTION = "This package includes the documentation for texlive-hep-math"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn64905"

RPM_NAME = "texlive-hep-math-doc-2023.201.1.1svn64905-53.2.noarch.rpm"
RPM_HASH = "184bdee5b95119e3c3278415c2b60d11e980d3324405e275966ac7efa17b9e81eac11c8b5e4555ea924c5b4fefcc66f8e9dee6cf4ae26bc3ec63700aee782bfa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hep-math-doc"

RDEPENDS:${PN} += ""

inherit rpm
