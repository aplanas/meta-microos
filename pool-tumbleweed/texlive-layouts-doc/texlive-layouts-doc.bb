SUMMARY = "Documentation for texlive-layouts"
DESCRIPTION = "This package includes the documentation for texlive-layouts"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.6dsvn42428"

RPM_NAME = "texlive-layouts-doc-2023.209.2.6dsvn42428-55.1.noarch.rpm"
RPM_HASH = "98d8b445c70fc8698d3fd55adde25585dadfbd440993c425adcff85e5ede37e8fb44f4b06fcf2411c152fdcaa5486d49ace34460bd477001f4411a0fcf76a0b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-layouts-doc"

RDEPENDS:${PN} += ""

inherit rpm
