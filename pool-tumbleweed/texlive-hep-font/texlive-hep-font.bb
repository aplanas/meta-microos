SUMMARY = "Latin modern extended by computer modern"
DESCRIPTION = "The hep-font package loads standard font packages and extends \
the usual Latin Modern implementations by replacing missing \
fonts with Computer Modern counterparts. The package is loaded \
with \\usepackage{hep-font}."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn64900"

RPM_NAME = "texlive-hep-font-2023.201.1.1svn64900-53.1.noarch.rpm"
RPM_HASH = "741055391847e843d5089b3cfbd4c189ac8a3226bcf5a313c6612efd35e2c54e017a70cd976b06cd3fd1f7f83dc50e743aed45cbaa1f8c326a4ffe616d9c2164"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hep-font.sty \
texlive-hep-font"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cfr-lm.sty \
tex-fix-cm.sty \
tex-fontenc.sty \
tex-fontspec.sty \
tex-ifluatex.sty \
tex-ifxetex.sty \
tex-inputenc.sty \
tex-kvoptions.sty \
tex-lmodern.sty \
tex-microtype.sty \
tex-nfssext-cfr.sty \
tex-pdftexcmds.sty \
tex-slantsc.sty \
tex-textcomp.sty \
tex-units.sty \
tex-xparse.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
