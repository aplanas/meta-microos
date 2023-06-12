SUMMARY = "LaTeX class for high quality slides"
DESCRIPTION = "Prosper is a LaTeX class for writing transparencies. It is \
written as an extension of the seminar class by Timothy Van \
Zandt. Prosper offers a friendly environment for creating \
slides for both presentations with an overhead projector and a \
video projector. Slides prepared for a presentation with a \
computer and a video projector may integrate animation effects, \
incremental display, and so on. Various visual styles are \
supported (including some that mimic PowerPoint) and others are \
being contributed."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0hsvn33033"

RPM_NAME = "texlive-prosper-2023.201.1.0hsvn33033-52.1.noarch.rpm"
RPM_HASH = "f5cb99a2bc4767f10563e033c84b5596d5d8bcba98c8beb6adfc6ebcd853650b0ce0b848e668bd0b32a1f8cb16ddf84b67a08846524f8a5ff4d7979702365383"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(PPRalcatel.sty) \
tex(PPRalienglow.sty) \
tex(PPRautumn.sty) \
tex(PPRazure.sty) \
tex(PPRblends.sty) \
tex(PPRcapsules.sty) \
tex(PPRcontemporain.sty) \
tex(PPRcorners.sty) \
tex(PPRdarkblue.sty) \
tex(PPRdefault.sty) \
tex(PPRframes.sty) \
tex(PPRfyma.sty) \
tex(PPRgyom.sty) \
tex(PPRlignesbleues.sty) \
tex(PPRmancini.sty) \
tex(PPRnuancegris.sty) \
tex(PPRprettybox.sty) \
tex(PPRrico.sty) \
tex(PPRserpaggi.sty) \
tex(PPRthomasd.sty) \
tex(PPRtroispoints.sty) \
tex(PPRwhitecross.sty) \
tex(PPRwinter.sty) \
tex(PPRwj.sty) \
tex(prosper.cls) \
texlive-prosper"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(amssymb.sty) \
tex(fp.sty) \
tex(graphicx.sty) \
tex(ifthen.sty) \
tex(mathpazo.sty) \
tex(multido.sty) \
tex(palatino.sty) \
tex(pst-grad.sty) \
tex(pst-slpe.sty) \
tex(semhelv.sty) \
tex(seminar.cls) \
tex(times.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
