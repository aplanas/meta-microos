SUMMARY = "Commands for inserting annotations"
DESCRIPTION = "This package defines a few LaTeX commands that may be useful \
when you proofread a LaTeX document. They allow you to easily \
highlight text and add comments in the margin. Vim escape \
sequences are provided for inserting or removing these LaTeX \
commands in the source. Options are provided for displaying the \
document with extra line spacing, and for displaying it in \
either corrected or uncorrected state, both without margin \
notes. The package is based on code for a text highlighting \
command that was published by Antal Spector-Zabusky on \
https://tex.stackexchange.com/questions/5959. The main file, \
proofread.dtx, is self-extracting, so you can generate the \
style file by compiling proofread.dtx with pdfLaTeX. This \
package is based on the soul package; so if you plan to \
highlight non-ASCII characters, you must compile your source \
with either XeTeX- or LuaTeX-based compilers."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.04svn61719"

RPM_NAME = "texlive-proofread-2023.201.1.04svn61719-52.1.noarch.rpm"
RPM_HASH = "9a4e4b265b4d8d85a74835d780b1f857185ca2993c186214a23ec1401d0cdd722996a8fd540839c4add93f1c274120a07bf7346b9b1e0cdf0db8978e11fc65e9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-proofread.sty \
texlive-proofread"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-marginnote.sty \
tex-setspace.sty \
tex-soul.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
