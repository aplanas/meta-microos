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

PV = "2023.209.1.0svn48500"

RPM_NAME = "texlive-tex-locale-2023.209.1.0svn48500-55.1.noarch.rpm"
RPM_HASH = "426e620702edeb831abe78e93ed7e6992b3d846ff0bc8c88519d4c9da6ab994e997dda919b73234e92108a369ea57e81ef1713a5570c16276d7f3e7ef9449047"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tex-locale-encodings.def \
tex-tex-locale-scripts-enc.def \
tex-tex-locale-support.def \
tex-tex-locale.sty \
tex-tex-locale.tex \
texlive-tex-locale"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-CJK.sty \
tex-CJKutf8.sty \
tex-babel.sty \
tex-datetime2.sty \
tex-etoolbox.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-inputenc.sty \
tex-pinyin.sty \
tex-polyglossia.sty \
tex-texosquery.sty \
tex-tracklang-scripts.sty \
tex-tracklang.sty \
tex-xeCJK.sty \
tex-xfor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
