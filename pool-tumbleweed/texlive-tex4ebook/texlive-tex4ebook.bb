SUMMARY = "Converter from LaTeX to ebook formats"
DESCRIPTION = "This is a bundle of Lua scripts and LaTeX packages for \
conversion of LaTeX files to ebook formats such as epub, mobi \
and epub3. tex4ht is used as the conversion engine."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3isvn66332"

RPM_NAME = "texlive-tex4ebook-2023.209.0.0.3isvn66332-55.1.noarch.rpm"
RPM_HASH = "f12c139db8a4b5c4a9341102d23a4cf1a34ed7f9a71b6c4cfc9a9e7c1ca880b6cf1785a91ec882ac1b634d444418bfeadbcd24f264c4030ae7131641cff92148"
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
