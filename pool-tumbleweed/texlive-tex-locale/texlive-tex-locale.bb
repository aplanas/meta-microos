SUMMARY = "Localisation support for TeX and LaTeX documents"
DESCRIPTION = "This package uses both tracklang and texosquery to look up the \
locale information from the operating system and provide \
commands that can access locale-dependent information, such as \
the currency symbol and decimal separator. The file \
tex-locale.tex provides generic TeX code. The LaTeX package \
tex-locale.sty can additionally load babel or polyglossia with \
the locale's language setting, as well as various other \
packages such as fontspec (XeLaTeX/LuaLaTeX) or fontenc + \
inputenc (pdfLaTeX)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn48500"

RPM_NAME = "texlive-tex-locale-2023.201.1.0svn48500-54.1.noarch.rpm"
RPM_HASH = "69c47c7b638b0771d49ceb3628304a5db6fc9b576e0c0151f9bb169ccea5f3ad5b91e0376c4aa8f12349ea0a23c53de75cfa7f68605e3d235132db110221f68e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(tex-locale-encodings.def) \
tex(tex-locale-scripts-enc.def) \
tex(tex-locale-support.def) \
tex(tex-locale.sty) \
tex(tex-locale.tex) \
texlive-tex-locale"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(CJK.sty) \
tex(CJKutf8.sty) \
tex(babel.sty) \
tex(datetime2.sty) \
tex(etoolbox.sty) \
tex(fontenc.sty) \
tex(fontspec.sty) \
tex(ifluatex.sty) \
tex(ifxetex.sty) \
tex(inputenc.sty) \
tex(pinyin.sty) \
tex(polyglossia.sty) \
tex(texosquery.sty) \
tex(tracklang-scripts.sty) \
tex(tracklang.sty) \
tex(xeCJK.sty) \
tex(xfor.sty) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
