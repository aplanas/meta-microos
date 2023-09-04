SUMMARY = "Variants of common box-commands that read their content as real box and not as macro argument"
DESCRIPTION = "The package uses the author's package collectbox to define \
variants of common box related macros which read the content as \
real box and not as macro argument. This enables the use of \
verbatim or other special material as part of this content. The \
provided macros have the same names as the original versions \
but start with an upper-case letter instead. The 'long-form' \
macros, like \\Makebox, can also be used as environments, but \
not the 'short-form' macros, like \\Mbox. However, normally the \
long form uses the short form anyway when no optional arguments \
are used."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn64967"

RPM_NAME = "texlive-realboxes-2023.209.0.0.2svn64967-54.2.noarch.rpm"
RPM_HASH = "077a9a025c5f511a5d33e42acf3f87e0d81b5d78350a00b5d0ff0ffaecd2bbcbf180c7e68df62638c3536c5ee75f0666cbe42dad898fd6513fbc07a6a1946c20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-realboxes.sty \
texlive-realboxes"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-adjcalc.sty \
tex-calc.sty \
tex-collectbox.sty \
tex-color.sty \
tex-dashbox.sty \
tex-fancybox.sty \
tex-graphics.sty \
tex-graphicx.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
