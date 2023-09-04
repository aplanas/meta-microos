SUMMARY = "Latin modern extended by computer modern"
DESCRIPTION = "The hep-font package loads standard font packages and extends \
the usual Latin Modern implementations by replacing missing \
fonts with Computer Modern counterparts. The package is loaded \
with \\usepackage{hep-font}."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn64900"

RPM_NAME = "texlive-hep-font-2023.209.1.1svn64900-54.2.noarch.rpm"
RPM_HASH = "7b0babb105d063dc9848ce80577a6188fdf8496bb0ca7efcbf9a97d0e87778d4096f852f9a1b00d5c4ce43920d26aed51b5fa0b4b45215e9b679eca662a3bb6e"
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
