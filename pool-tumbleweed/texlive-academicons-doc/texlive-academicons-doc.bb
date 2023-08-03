SUMMARY = "Documentation for texlive-academicons"
DESCRIPTION = "This package includes the documentation for texlive-academicons"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.9.1_2svn62622"

RPM_NAME = "texlive-academicons-doc-2023.209.1.9.1_2svn62622-55.1.noarch.rpm"
RPM_HASH = "e165ad137d8d46f4ee92f2eea92c4623b3bb42fd3b58fba949e9cb08da40de26402400e1e3af30c610ee716f49cf74d0383f04a716e632aefa94d777bf39fe40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-academicons-doc"

RDEPENDS:${PN} += ""

inherit rpm
