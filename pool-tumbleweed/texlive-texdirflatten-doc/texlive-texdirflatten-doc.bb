SUMMARY = "Documentation for texlive-texdirflatten"
DESCRIPTION = "This package includes the documentation for texlive-texdirflatten"
LICENSE = "Artistic-1.0"

PV = "2023.201.1.3svn55064"

RPM_NAME = "texlive-texdirflatten-doc-2023.201.1.3svn55064-54.1.noarch.rpm"
RPM_HASH = "25c3433728e80d3e253bed693e73490d09635c27871a7f84350a8ce372e4ce5754315061b4d68fb5c3b2fca639027605b0d9b02ae734e94ce3c538c30dbda123"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-texdirflatten.1 \
texlive-texdirflatten-doc"

RDEPENDS:${PN} += ""

inherit rpm
