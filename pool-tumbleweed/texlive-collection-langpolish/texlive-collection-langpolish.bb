SUMMARY = "Polish"
DESCRIPTION = "Support for Polish."
LICENSE = "LPPL-1.0"

PV = "2023.208.svn54074"

RPM_NAME = "texlive-collection-langpolish-2023.208.svn54074-60.1.noarch.rpm"
RPM_HASH = "27ade206a4c67915bf1881afba929101e7f60667c79d65df62b794a65a1a4cdeb88296cec20fc7162d677faa5882982d80e9d66107c4744d9f9d02b039258d6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collection-langpolish"

RDEPENDS:${PN} += "texlive-babel-polish \
texlive-bredzenie \
texlive-cc-pl \
texlive-collection-basic \
texlive-collection-latex \
texlive-gustlib \
texlive-gustprog \
texlive-hyphen-polish \
texlive-lshort-polish \
texlive-mex \
texlive-mwcls \
texlive-pl \
texlive-polski \
texlive-przechlewski-book \
texlive-qpxqtx \
texlive-tap \
texlive-tex-virtual-academy-pl \
texlive-texlive-pl \
texlive-utf8mex"

inherit rpm
