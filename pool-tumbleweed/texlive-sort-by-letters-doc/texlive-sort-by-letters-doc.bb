SUMMARY = "Documentation for texlive-sort-by-letters"
DESCRIPTION = "This package includes the documentation for texlive-sort-by-letters"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn27128"

RPM_NAME = "texlive-sort-by-letters-doc-2023.209.svn27128-58.1.noarch.rpm"
RPM_HASH = "fbe63b16e1071e00532c8fdfc06537f0a7233e230e7ef59a82bf8503743600f43d59f786524dd44df6ddcc0fda059953acc359b798efc0c10120ab4376aa63cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sort-by-letters-doc"

RDEPENDS:${PN} += ""

inherit rpm
