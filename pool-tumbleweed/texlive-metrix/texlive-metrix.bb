SUMMARY = "Typeset metric marks for Latin text"
DESCRIPTION = "The package may be used to type the prosodics/metrics of \
(latin) verse; it provides macros to typeset the symbols \
standing alone, and in combination with symbols, giving \
automatic alignment. The package requires TikZ (including the \
calc library), xpatch, and xparse (thus also requiring the \
experimental LaTeX3 environment)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn52323"

RPM_NAME = "texlive-metrix-2023.201.1.5svn52323-54.1.noarch.rpm"
RPM_HASH = "5f116fef57f3252ab75d9407f4d9f2ed71f221172a4ffc965a9a3f6d9b81b066e2579abedc6967f3ccb8393b8587b7a4830ca63ef67eb9619cc472db36355530"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-metrix.sty \
texlive-metrix"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-expl3.sty \
tex-textcomp.sty \
tex-tikz.sty \
tex-xparse.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
