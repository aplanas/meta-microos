SUMMARY = "Tools for experimenting with tagging using pdfLaTeX and LuaLaTeX"
DESCRIPTION = "The package offers tools to experiment with tagging and \
accessibility using pdfLaTeX and LuaTeX. It isn't meant for \
production but allows the user to try out how difficult it is \
to tag some structures; to try out how much tagging is really \
needed; to test what else is needed so that a pdf works e.g. \
with a screen reader. Its goal is to get a feeling for what has \
to be done, which kernel changes are needed, how packages \
should be adapted."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.98esvn66461"

RPM_NAME = "texlive-tagpdf-2023.201.0.0.98esvn66461-54.1.noarch.rpm"
RPM_HASH = "4a0dbe6ef519ad384f8ade1c0c7a512e64b628512e2584a6a485252ad2d61890a16d301df4bbefce1079b53315650ab4c26b741dffca3cc40e9571611e34343a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tagpdf-base.sty \
tex-tagpdf-debug-generic.sty \
tex-tagpdf-debug-lua.sty \
tex-tagpdf-debug.sty \
tex-tagpdf-luatex.def \
tex-tagpdf-mc-code-generic.sty \
tex-tagpdf-mc-code-lua.sty \
tex-tagpdf-ns-latex-book.def \
tex-tagpdf-ns-latex-inline.def \
tex-tagpdf-ns-latex.def \
tex-tagpdf-ns-mathml.def \
tex-tagpdf-ns-pdf.def \
tex-tagpdf-ns-pdf2.def \
tex-tagpdf.sty \
tex-tagpdfdocu-patches.sty \
texlive-tagpdf"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-l3ref-tmp.sty \
tex-output-patches-tmp-ltx.sty \
tex-pdfmanagement-testphase.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
