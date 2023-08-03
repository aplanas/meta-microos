SUMMARY = "Embed MetaPost figures within LaTeX documents"
DESCRIPTION = "This LaTeX2e package enables the embedding of MetaPost figures \
within LaTeX documents. The package automatically collects the \
embedded definitions and figures in a .mp file, adds an \
appropriate LaTeX document structure, and compiles it to .mps \
files. It also allows for various configuration options to \
manage the generation of files and compilation."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn49559"

RPM_NAME = "texlive-mpostinl-2023.209.1.5svn49559-55.1.noarch.rpm"
RPM_HASH = "e4ad2051e1d23a5f6365e13ea8eebe602518e7decfc5ca2cab984401cb329198fc53ab0c8680e7e2f49671b3ff014bd33eebc35ade2ce43475df00b7a7a8421b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mpostinl.sty \
texlive-mpostinl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-keyval.sty \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
