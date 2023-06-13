SUMMARY = "Documentation for texlive-lualibs"
DESCRIPTION = "This package includes the documentation for texlive-lualibs"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.75svn64615"

RPM_NAME = "texlive-lualibs-doc-2023.201.2.75svn64615-52.1.noarch.rpm"
RPM_HASH = "d4ac62b66046ab56b559303779a5552e62e7bdf862d4307eacfb7bf4450055e212546a5ce27e187e295b5bc713fd7ca48b6c6e00e06dec8ab9025c0a9093510d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lualibs-doc"

RDEPENDS:${PN} += ""

inherit rpm
