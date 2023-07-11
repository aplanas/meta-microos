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

PV = "2023.201.0.0.2svn64967"

RPM_NAME = "texlive-realboxes-2023.201.0.0.2svn64967-53.2.noarch.rpm"
RPM_HASH = "eb19a4adc56b30f9917052d3cb8bf1ea3a3c3316b334fddc3bc095cb61bde86ad0afc779a1da6760ed5804d0251336e5dd7cb55d11eaf4aba777ee11aa54a675"
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
