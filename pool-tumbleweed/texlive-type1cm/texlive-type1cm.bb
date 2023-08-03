SUMMARY = "Arbitrary size font selection in LaTeX"
DESCRIPTION = "LaTeX, by default, restricts the sizes at which you can use its \
default computer modern fonts, to a fixed set of discrete sizes \
(effectively, a set specified by Knuth). The type1cm package \
removes this restriction; this is particularly useful when \
using scalable versions of the cm fonts (Bakoma, or the \
versions from BSR/Y&Y, or True Type versions from Kinch, PCTeX, \
etc.). In fact, since modern distributions will automatically \
generate any bitmap font you might need, type1cm has wider \
application than just those using scaleable versions of the \
fonts. Note that the LaTeX distribution now contains a package \
fix-cm, which performs the task of type1cm, as well as doing \
the same job for T1- and TS1-encoded ec fonts."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn21820"

RPM_NAME = "texlive-type1cm-2023.209.svn21820-53.1.noarch.rpm"
RPM_HASH = "d14e19bffc78e763a050df374ae2071291a1d47899e2180e1cc3953ad9224228ba09fd0254883244f08d0180de1301231c752b5e3f4b9ebffe89fc31fb016026"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-type1cm.sty \
texlive-type1cm"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
