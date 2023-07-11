SUMMARY = "Support macros for other packages"
DESCRIPTION = "Miscellaneous macros used by others of the author's packages. \
Contents of the package: \\newgif and other globals; \\@ifnextcat \
and \\@ifXeTeX; \\(Re)storeMacro(s) to override redefinitions; \
\\afterfi and friends; commands from relsize, etc.; 'almost an \
environment' or redefinition of \\begin (\\begin* doesn't check \
if the argument environment is defined)."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.996svn24287"

RPM_NAME = "texlive-gmutils-2023.201.0.0.996svn24287-53.2.noarch.rpm"
RPM_HASH = "8f240d248dfb5f0689cb93ca74ad1628bf9a5114d37a55ea6315c032e735d0bcc2414c1de8e82ad9dcdcfdb711eed2844a0c8d7d99b52170dd87c3aa95a50d80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gmRCS.sty \
tex-gmampulex.sty \
tex-gmbase.sty \
tex-gmcommand.sty \
tex-gmenvir.sty \
tex-gmlogos.sty \
tex-gmmeta.sty \
tex-gmmw.sty \
tex-gmnotonlypream.sty \
tex-gmparts.sty \
tex-gmrelsize.sty \
tex-gmtypos.sty \
tex-gmurl.sty \
tex-gmutils.sty \
texlive-gmutils"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-expl3.sty \
tex-graphicx.sty \
tex-multicol.sty \
tex-polski.sty \
tex-xkeyval.sty \
tex-xltxtra.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
