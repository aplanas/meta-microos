SUMMARY = "Document class for the journal of DANTE"
DESCRIPTION = "The bundle provides a class and style file for typesetting 'Die \
TeXnische Komodie' -- the communications of the German TeX \
Users Group DANTE e.V. The arrangement means that the class may \
be used by article writers to typeset a single article, as well \
as to produce the complete journal."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.08nsvn65315"

RPM_NAME = "texlive-dtk-2023.209.2.08nsvn65315-53.1.noarch.rpm"
RPM_HASH = "1ad8024fbb2b3117d6d95c5f7dd8f124da41909c53a2646c27435951525741680b8e8eb65df33814a5932531d907bea944be273ff73f3cda693e0d8ddbaddd84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dtk-author.clo \
tex-dtk-full.clo \
tex-dtk-new-engines.clo \
tex-dtk-old-engines.clo \
tex-dtk-url.sty \
tex-dtk.bbx \
tex-dtk.cbx \
tex-dtk.cls \
texlive-dtk"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-AnonymousPro.sty \
tex-atveryend.sty \
tex-babel.sty \
tex-chem-angew.bbx \
tex-csquotes.sty \
tex-datetime2.sty \
tex-embedfile.sty \
tex-enumitem.sty \
tex-environ.sty \
tex-eurosym.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-graphicx.sty \
tex-hvextern.sty \
tex-hvlogos.sty \
tex-hvqrurl.sty \
tex-ifluatex.sty \
tex-ifpdf.sty \
tex-iftex.sty \
tex-ifvtex.sty \
tex-ifxetex.sty \
tex-inputenc.sty \
tex-libertine.sty \
tex-libertinus-otf.sty \
tex-lstautogobble.sty \
tex-luatex85.sty \
tex-marginnote.sty \
tex-multicol.sty \
tex-newunicodechar.sty \
tex-numeric.cbx \
tex-pdfescape.sty \
tex-picture.sty \
tex-ragged2e.sty \
tex-scrhack.sty \
tex-scrlayer-scrpage.sty \
tex-selnolig.sty \
tex-splitidx.sty \
tex-tabularx.sty \
tex-textcomp.sty \
tex-trimspaces.sty \
tex-unicode-math.sty \
tex-url.sty \
tex-verbatim.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
