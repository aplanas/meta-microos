SUMMARY = "A 'lipsum' for Persian"
DESCRIPTION = "The package provides lipsum-like facilities for the Persian \
language. The source of the filling text is the Persian epic \
'the Shanameh' (100 paragraphs are used.) The package needs to \
be run under XeLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn30171"

RPM_NAME = "texlive-ptext-2023.201.1.1svn30171-53.1.noarch.rpm"
RPM_HASH = "272e7bc48d382491ae763ae875ebd61e5b31ab68c5483e163bfe43849dbcd886c27d1ecea11b89ee4399c4f8c0f340e887c590f485978dc6af97cac027fd283d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ptext.sty) \
texlive-ptext"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(biditools.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
