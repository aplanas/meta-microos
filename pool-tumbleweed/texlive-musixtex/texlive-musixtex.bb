SUMMARY = "Sophisticated music typesetting"
DESCRIPTION = "MusiXTeX provides a set of macros, based on the earlier \
MusicTeX, for typesetting music with TeX. To produce optimal \
spacing, MusiXTeX is a three-pass system: etex, musixflx, and \
etex again. (Musixflx is a lua script that is provided in the \
bundle.) The three-pass process, optionally followed by \
processing for printed output, is automated by the musixtex \
wrapper script. The package uses its own specialised fonts, \
which must be available on the system for musixtex to run. This \
version of MusiXTeX builds upon work by Andreas Egler, whose \
own version is no longer being developed. The MusiXTeX macros \
are universally acknowledged to be challenging to use directly: \
the pmx preprocessor compiles a simpler input language to \
MusiXTeX macros.."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.36svn65519"

RPM_NAME = "texlive-musixtex-2023.201.1.36svn65519-54.1.noarch.rpm"
RPM_HASH = "8a78b94e074ea5d662f4eef9c0401a26779ef7d572e4001e372df6210e9372ed254c3281a5abe2a9eb701bd6ecaa65971ab192ad71bd1666fb36ad99a1d870ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-musixadd.tex \
tex-musixadf.tex \
tex-musixbar.tex \
tex-musixbbm.tex \
tex-musixblx.tex \
tex-musixbm.tex \
tex-musixcho.tex \
tex-musixcpt.sty \
tex-musixcpt.tex \
tex-musixcrd.sty \
tex-musixcrd.tex \
tex-musixdat.tex \
tex-musixdbr.tex \
tex-musixdia.tex \
tex-musixec.tex \
tex-musixeng.tex \
tex-musixesf.tex \
tex-musixevo.tex \
tex-musixext.tex \
tex-musixfll.sty \
tex-musixfll.tex \
tex-musixftab.tex \
tex-musixgre.tex \
tex-musixgui.tex \
tex-musixhor.tex \
tex-musixhou.tex \
tex-musixhv.tex \
tex-musixinv.tex \
tex-musixjt.tex \
tex-musixlit.tex \
tex-musixltx.tex \
tex-musixlyr.tex \
tex-musixmad.tex \
tex-musixmkm.tex \
tex-musixper.tex \
tex-musixplt.tex \
tex-musixpoi.tex \
tex-musixppff.tex \
tex-musixps.tex \
tex-musixref.tex \
tex-musixslu.tex \
tex-musixsqr.tex \
tex-musixste.tex \
tex-musixstf.tex \
tex-musixstr.tex \
tex-musixsty.tex \
tex-musixtex.sty \
tex-musixtex.tex \
tex-musixthacc.tex \
tex-musixtmr.tex \
tex-musixtri.tex \
tex-musixvbm.tex \
tex-tuplet.tex \
texlive-musixtex"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/texlua \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-musixtex-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
