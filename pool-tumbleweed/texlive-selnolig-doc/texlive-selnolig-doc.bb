SUMMARY = "Documentation for texlive-selnolig"
DESCRIPTION = "This package includes the documentation for texlive-selnolig"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.302svn38721"

RPM_NAME = "texlive-selnolig-doc-2023.209.0.0.302svn38721-54.1.noarch.rpm"
RPM_HASH = "a8c9e7b02009c907cc2f89bccd5febe1e1f968c8ceac81efc8155e95832678a3fa7625c03de29d44894aa6054b595420435d58f1c03229a3da69a9ae0628bd43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-selnolig-doc"

RDEPENDS:${PN} += ""

inherit rpm
