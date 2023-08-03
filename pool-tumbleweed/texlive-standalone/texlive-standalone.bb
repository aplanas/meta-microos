SUMMARY = "Compile TeX pictures stand-alone or as part of a document"
DESCRIPTION = "A class and package is provided which allows TeX pictures or \
other TeX code to be compiled standalone or as part of a main \
document. Special support for pictures with beamer overlays is \
also provided. The package is used in the main document and \
skips extra preambles in sub-files. The class may be used to \
simplify the preamble in sub-files. By default the preview \
package is used to display the typeset code without margins. \
The behaviour in standalone mode may adjusted using a \
configuration file standalone.cfg to redefine the standalone \
environment."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3bsvn64677"

RPM_NAME = "texlive-standalone-2023.209.1.3bsvn64677-58.1.noarch.rpm"
RPM_HASH = "527946296719afd1782b16f18adfc2aec2b623ce471435e07a045d4dcb3cd57649da709d05242e75497512e25924e13066aae25fa06aec7b3a483bbdd66b4383"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-standalone.cfg \
tex-standalone.cls \
tex-standalone.sty \
tex-standalone.tex \
texlive-standalone"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-adjustbox.sty \
tex-currfile-abspath.sty \
tex-currfile.sty \
tex-filemod-expmin.sty \
tex-gincltex.sty \
tex-ifluatex.sty \
tex-ifpdf.sty \
tex-ifxetex.sty \
tex-luatex85.sty \
tex-multido.sty \
tex-pdftexcmds.sty \
tex-preview.sty \
tex-pstricks.sty \
tex-shellesc.sty \
tex-tikz.sty \
tex-trimclip.sty \
tex-varwidth.sty \
tex-xkeyval.sty \
texlive \
texlive-adjustbox \
texlive-currfile \
texlive-filemod \
texlive-filesystem \
texlive-gincltex \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-xkeyval"

inherit rpm
