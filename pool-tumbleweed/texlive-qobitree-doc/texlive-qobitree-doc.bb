SUMMARY = "Documentation for texlive-qobitree"
DESCRIPTION = "This package includes the documentation for texlive-qobitree"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-qobitree-doc-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "dda48b1348d8ff5f8b25df2f1e2216fad405a8b09882b68e51ec826d3a57603c52a56a955cc25359fb47ae049e840bb03568edb80c8935f785d8bbab1b69b0fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-qobitree-doc"

RDEPENDS:${PN} += ""

inherit rpm
