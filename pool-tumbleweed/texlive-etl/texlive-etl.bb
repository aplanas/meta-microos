SUMMARY = "Expandable token list operations"
DESCRIPTION = "This package provides expandable token list operations for \
which expl3's l3tl only has unexpandable variants. These \
expandable versions are typically slower than the unexpandable \
code. Unlike the l3tl versions, the functions in this module \
may contain braces and macro parameter tokens in their \
arguments, but as a drawback they cannot distinguish some \
tokens and do not consider the character code of group-begin \
and group-end tokens. Additionally a general map to token lists \
is provided, modelled after the expl3 internal __tl_act:NNNn \
but with additional features. The package has no immediate use \
for document authors; it only contains expl3 functions intended \
for programmers."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn60998"

RPM_NAME = "texlive-etl-2023.209.0.0.3svn60998-53.1.noarch.rpm"
RPM_HASH = "447b15962c42b38e34af1119ddc2fd180adbfedd8c1aff4c4683bfaba8cf5bb164b52cadfee5ca871359a7363eb1426c57759faa1d0a4055e33546b6e352f203"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-etl.sty \
texlive-etl"

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
