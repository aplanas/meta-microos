SUMMARY = "Documentation for texlive-sort-by-letters"
DESCRIPTION = "This package includes the documentation for texlive-sort-by-letters"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn27128"

RPM_NAME = "texlive-sort-by-letters-doc-2023.201.svn27128-57.1.noarch.rpm"
RPM_HASH = "b75d5eddd5d2e6b1720ffa79f2f14a4b269c64d60aab875f72c40176f14723a3b22c229b262421132048ed71cbda0759da05333e335b752bedb451d03c3560f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sort-by-letters-doc"

RDEPENDS:${PN} += ""

inherit rpm
