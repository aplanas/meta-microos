SUMMARY = "Documentation for texlive-nidanfloat"
DESCRIPTION = "This package includes the documentation for texlive-nidanfloat"
LICENSE = "BSD-3-Clause"

PV = "2023.209.svn48295"

RPM_NAME = "texlive-nidanfloat-doc-2023.209.svn48295-55.1.noarch.rpm"
RPM_HASH = "3cf45a4f34a990e2116b3e7f4a8b80bf9ab39d2d21c33920d64fc9e1e781eef7b97fcc038fc302a5329571d8cc2511ecd31a2ea9a153635d0cd2d31d801f0d43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-nidanfloat-doc-ja \
texlive-nidanfloat-doc"

RDEPENDS:${PN} += ""

inherit rpm
