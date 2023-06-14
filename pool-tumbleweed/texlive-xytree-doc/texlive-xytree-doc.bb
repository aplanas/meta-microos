SUMMARY = "Documentation for texlive-xytree"
DESCRIPTION = "This package includes the documentation for texlive-xytree"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn15878"

RPM_NAME = "texlive-xytree-doc-2023.201.1.5svn15878-52.1.noarch.rpm"
RPM_HASH = "e6f3f0ee9e553d96aba724f697634a60a5da196f46e7bb314b9febd7ad848fed8b9b09c0a5035921079a2ddd98800dba07949afaff24a5f90c102b99f38735d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xytree-doc-en \
texlive-xytree-doc"

RDEPENDS:${PN} += ""

inherit rpm
