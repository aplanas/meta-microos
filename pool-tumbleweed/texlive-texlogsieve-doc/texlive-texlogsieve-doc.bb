SUMMARY = "Documentation for texlive-texlogsieve"
DESCRIPTION = "This package includes the documentation for texlive-texlogsieve"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.3.1svn64301"

RPM_NAME = "texlive-texlogsieve-doc-2023.201.1.3.1svn64301-54.1.noarch.rpm"
RPM_HASH = "08c150245cfe96442760acc3e92d2ac9cbe2b4ff36b18adaab4bef1f1f1d24d49be8459729fa7b0782095ecc857d184176a4e4f9517dde507547e6b6b62447f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-texlogsieve.1 \
texlive-texlogsieve-doc"

RDEPENDS:${PN} += ""

inherit rpm
