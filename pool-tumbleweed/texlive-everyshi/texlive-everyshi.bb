SUMMARY = "Take action at every \\shipout"
DESCRIPTION = "This package provides hooks into \\sshipout called \\EveryShipout \
and \\AtNextShipout analogous to \\AtBeginDocument. With the \
introduction of the LaTeX hook management this package became \
obsolete in 2020 and is only provided for backwards \
compatibility. For current versions of LaTeX it is only mapping \
the hooks to the original everyshi macros. In case you use an \
older LaTeX format, everyshi will automatically fall back to \
its old implementation by loading everyshi-2001-05-15."
LICENSE = "LPPL-1.0"

PV = "2023.209.4.00svn57001"

RPM_NAME = "texlive-everyshi-2023.209.4.00svn57001-53.1.noarch.rpm"
RPM_HASH = "488b7c885a63beb55f991e78c91d58f2bf749831598a26134539451c34205077d7327fb565fe5168fde7363632e7000860971b0be0ca9ac8f34fe78e9a8365ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-everyshi-2001-05-15.sty \
tex-everyshi.sty \
texlive-everyshi"

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
