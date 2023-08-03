SUMMARY = "PDF/X and PDF/A support for pdfTeX, LuaTeX and XeTeX"
DESCRIPTION = "The package helps LaTeX users to create PDF/X, PFD/A and other \
standards-compliant PDF documents with pdfTeX, LuaTeX and \
XeTeX."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6.3svn50338"

RPM_NAME = "texlive-pdfx-2023.209.1.6.3svn50338-52.1.noarch.rpm"
RPM_HASH = "de072db6d40db1be64f55ca3766f9515b4c43294a366dc00f9020a74413988a465ab21dc38e2cfda5c44265146de2d9767831f06e1b8ff870c72fac107c56fee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-8bit.def \
tex-AdobeColorProfiles.tex \
tex-AdobeExternalProfiles.tex \
tex-CallasColorProfiles.tex \
tex-glyphtounicode-cmr.tex \
tex-glyphtounicode-ntx.tex \
tex-l8u-penc.def \
tex-l8uarb-penc.def \
tex-l8uarm-penc.def \
tex-l8ucyr-penc.def \
tex-l8udev-penc.def \
tex-l8ugrk-penc.def \
tex-l8uheb-penc.def \
tex-l8ulat-penc.def \
tex-l8umath-penc.def \
tex-pdfx.sty \
tex-text89.def \
texlive-pdfx"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-colorprofiles.sty \
tex-everyshi.sty \
tex-glyphtounicode.tex \
tex-ifluatex.sty \
tex-ifpdf.sty \
tex-iftex.sty \
tex-ifthen.sty \
tex-ifxetex.sty \
tex-inputenc.sty \
tex-luatex85.sty \
tex-pdftexcmds.sty \
tex-stringenc.sty \
tex-xcolor.sty \
tex-xmpincl.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
