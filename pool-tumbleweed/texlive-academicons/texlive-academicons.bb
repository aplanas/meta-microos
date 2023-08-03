SUMMARY = "Font containing high quality icons of online academic profiles"
DESCRIPTION = "The academicons package provides access in (La)TeX to 124 high \
quality icons of online academic profiles included in the free \
'Academicons' font. This package requires either the Xe(La)TeX \
or Lua(La)TeX engine to load the 'Academicons' font from the \
system, which requires installing the bundled academicons.ttf \
font file. As new releases come out, it is recommended to \
install the bundled font version as there may be differences \
between the package and previous font versions or newest font \
versions not yet contemplated in the package. The 'Academicons' \
font was designed by James Walsh and released (see \
http://jpswalsh.github.io/academicons/) under the open SIL Open \
Font License. This package is a redistribution of the free \
'Academicons' font with specific bindings for (La)TeX. It is \
inspired and based on the fontawesome package. The academicons \
package provides the generic \\aiicon command to access icons, \
which takes as mandatory argument the name of the desired icon. \
It also provides individual direct commands for each specific \
icon. The full list of icons and their respective names and \
direct commands can be found in the manual. For example, \
\\aiicon{googlescholar} yields the same result as \
\\aiGoogleScholar."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.9.1_2svn62622"

RPM_NAME = "texlive-academicons-2023.209.1.9.1_2svn62622-55.1.noarch.rpm"
RPM_HASH = "e1d93b0d4194fecd08f65efe7b5fe0eb963b60aad100c45cb7b74960534e89ae4a60e2a770528badd5f452e74d4059205c3d4776b609da7db2c7d48bba96080b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-academicons.sty \
tex-tuacademicons.fd \
texlive-academicons"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-academicons-fonts \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
