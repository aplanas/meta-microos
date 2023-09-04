SUMMARY = "Support macros for other packages"
DESCRIPTION = "Miscellaneous macros used by others of the author's packages. \
Contents of the package: \\newgif and other globals; \\@ifnextcat \
and \\@ifXeTeX; \\(Re)storeMacro(s) to override redefinitions; \
\\afterfi and friends; commands from relsize, etc.; 'almost an \
environment' or redefinition of \\begin (\\begin* doesn't check \
if the argument environment is defined)."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.996svn24287"

RPM_NAME = "texlive-gmutils-2023.209.0.0.996svn24287-54.2.noarch.rpm"
RPM_HASH = "21eaba872705b57590828100ab916ffb8232d70a263aae35bc9d22bfe692e751983400a454554990d34eb86f6e72e0f1afe76a796310584e27646d93f25f1a88"
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
