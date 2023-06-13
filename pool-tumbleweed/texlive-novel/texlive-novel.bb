SUMMARY = "Class for printing fiction, such as novels"
DESCRIPTION = "This LuaLaTeX document class is specifically written to meet \
the needs of original fiction writers, who are typesetting \
their own novels for non-color print-on-demand technology. \
Built-in PDF/X is available, using new technology. The package \
is well suited for detective novels, science fiction, and short \
stories. It is however not recommended for creating color \
picture books or dissertations."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.80svn65848"

RPM_NAME = "texlive-novel-2023.201.1.80svn65848-54.1.noarch.rpm"
RPM_HASH = "ca3da18fc4415874b30d412335e679cc9caa9d4c3eeb9ccd74ca767a6030c01c348ef08b2416bec93c7dc92a2838cf8bbc337711de26026ef41ae60042cce38e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(novel-CGATSTR001.clo) \
tex(novel-CalculateLayout.sty) \
tex(novel-ChapterScene.sty) \
tex(novel-DropCap.sty) \
tex(novel-FOGRA39.clo) \
tex(novel-FileData.sty) \
tex(novel-Fonts.sty) \
tex(novel-Footnotes.sty) \
tex(novel-HeadFootStyles.sty) \
tex(novel-Images.sty) \
tex(novel-JC200103.clo) \
tex(novel-LayoutSettings.sty) \
tex(novel-PostLayout.sty) \
tex(novel-Sandbox.sty) \
tex(novel-TextMacros.sty) \
tex(novel-microtype.cfg) \
tex(novel-pdfx.sty) \
tex(novel-xmppacket.sty) \
tex(novel.cls) \
texlive-novel"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(adjustbox.sty) \
tex(atbegshi.sty) \
tex(calc.sty) \
tex(changepage.sty) \
tex(eso-pic.sty) \
tex(etoolbox.sty) \
tex(fancyhdr.sty) \
tex(fontspec.sty) \
tex(fp.sty) \
tex(hyperref.sty) \
tex(ifluatex.sty) \
tex(ifxetex.sty) \
tex(keyval.sty) \
tex(letltxmacro.sty) \
tex(lipsum.sty) \
tex(luacode.sty) \
tex(luatex85.sty) \
tex(magaz.sty) \
tex(microtype.sty) \
tex(noindentafter.sty) \
tex(pdfpages.sty) \
tex(pdftexcmds.sty) \
tex(polyglossia.sty) \
tex(silence.sty) \
tex(textpos.sty) \
tex(unicode-math.sty) \
tex(wrapfig.sty) \
tex(xcolor.sty) \
tex(xfp.sty) \
tex(xifthen.sty) \
tex(xparse.sty) \
tex(xstring.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-novel-fonts \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
