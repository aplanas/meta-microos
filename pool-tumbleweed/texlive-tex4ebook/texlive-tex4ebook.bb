SUMMARY = "Converter from LaTeX to ebook formats"
DESCRIPTION = "This is a bundle of Lua scripts and LaTeX packages for \
conversion of LaTeX files to ebook formats such as epub, mobi \
and epub3. tex4ht is used as the conversion engine."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3isvn66332"

RPM_NAME = "texlive-tex4ebook-2023.201.0.0.3isvn66332-54.1.noarch.rpm"
RPM_HASH = "b426eb831462e3a798646727a322ef501ddd56495f8a81facf256aea98ab619182d0348273a130266a5fb9b9b75e93eae4b9ea848484d8202559af67f28aa936"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tex4ebook.sty \
texlive-tex4ebook"

RDEPENDS:${PN} += "/usr/bin/luatex \
/usr/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-graphicx.sty \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-make4ht \
texlive-scripts \
texlive-scripts-bin \
texlive-tex4ebook-bin \
texlive-tex4ht"

inherit rpm
