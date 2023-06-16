SUMMARY = "Simplify typesetting mathematical delimiters"
DESCRIPTION = "The package permits simpler control of delimiters without \
excessive use of \\big... commands (and the like)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn23974"

RPM_NAME = "texlive-delim-2023.201.1.0svn23974-52.1.noarch.rpm"
RPM_HASH = "65e7c49fea6d23ef1e4a6156b7688fa19857505533c5cdd21d803e495b71a86d08c7185f4ed4249c67e02b0800f5d23644afb1f7eb650686e10fdbf5b6f9b533"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-delim.sty \
texlive-delim"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
