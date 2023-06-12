SUMMARY = "Basic formatting for short documents"
DESCRIPTION = "This package provides basic formatting for short documents such \
as notes on a specific topic, short documentation, or quick \
memos. It aims to cover all basic needs for such purposes: \
include a standard set of relevant packages, a nice title which \
doesn't take up too much space, better page margin sizes, and \
some basic styling to make the note look nicer. At the same \
time, it is highly flexible and customizable."
LICENSE = "LPPL-1.0"

PV = "2023.201.4.0svn60733"

RPM_NAME = "texlive-phfnote-2023.201.4.0svn60733-51.1.noarch.rpm"
RPM_HASH = "13b87f1215339e439b3d35b7b91068eda6c757c0d3f193d9fb4b096d5e4c7ff0c8ea787e7312fb5af685a9f5329314b2c54981dd4ab6831995e7a948dc244c51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(phfnote.sty) \
tex(phfnotepreset-xpkgdoc.def) \
texlive-phfnote"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(MnSymbol.sty) \
tex(amsfonts.sty) \
tex(amsmath.sty) \
tex(amssymb.sty) \
tex(amsthm.sty) \
tex(bbm.sty) \
tex(caption.sty) \
tex(csquotes.sty) \
tex(dsfont.sty) \
tex(enumitem.sty) \
tex(etoolbox.sty) \
tex(float.sty) \
tex(fontenc.sty) \
tex(fourier.sty) \
tex(geometry.sty) \
tex(graphicx.sty) \
tex(hypdoc.sty) \
tex(hyperref.sty) \
tex(iftex.sty) \
tex(inputenc.sty) \
tex(kvoptions.sty) \
tex(mathtools.sty) \
tex(microtype.sty) \
tex(opensans.sty) \
tex(sectsty.sty) \
tex(setspace.sty) \
tex(tcolorbox.sty) \
tex(url.sty) \
tex(verbdef.sty) \
tex(xcolor.sty) \
tex(xkeyval.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
