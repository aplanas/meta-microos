SUMMARY = "A TeX labelling package"
DESCRIPTION = "Pinlabel is a labelling package for attaching perfectly \
formatted TeX labels to figures and diagrams in both eps and \
pdf formats. It is suitable both for labelling a new diagram \
and for relabelling an existing diagram. The package uses \
coordinates derived from GhostView (or gv) and labels are \
placed with automatic and consistent spacing relative to the \
object labelled."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn24769"

RPM_NAME = "texlive-pinlabel-2023.209.1.2svn24769-52.1.noarch.rpm"
RPM_HASH = "a8378c469c471a9d969df1f87ce856a50433276711300eda9f9a5f29c34d225f6f752f33da4c70de29b6dc3b5065408312e4950fc156b731e5f16d60f6f4ce8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pinlabel.sty \
texlive-pinlabel"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
