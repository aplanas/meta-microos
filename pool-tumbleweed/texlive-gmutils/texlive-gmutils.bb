SUMMARY = "Support macros for other packages"
DESCRIPTION = "Miscellaneous macros used by others of the author's packages. \
Contents of the package: \\newgif and other globals; \\@ifnextcat \
and \\@ifXeTeX; \\(Re)storeMacro(s) to override redefinitions; \
\\afterfi and friends; commands from relsize, etc.; 'almost an \
environment' or redefinition of \\begin (\\begin* doesn't check \
if the argument environment is defined)."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.996svn24287"

RPM_NAME = "texlive-gmutils-2023.209.0.0.996svn24287-54.1.noarch.rpm"
RPM_HASH = "725b48b9a03957263219224b8f1b88fc84db369092bcb45bfd8bbb10c9536851dc3193e5c4fe79be262043a05c85011d929b23719d87d5b0551c34508a44ae8f"
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
