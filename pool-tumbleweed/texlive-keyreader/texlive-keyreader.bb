SUMMARY = "A robust interface to xkeyval"
DESCRIPTION = "The package provides a robust interface to controlling keys in \
xkeyval, removing some of that package's restrictions. The \
package also addresses some of the issues now covered by the \
author's ltxkeys package, which was assumed to be a replacement \
for keyreader. Since keyreader has remained a favourite with \
users, it has been reinstated."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.5bsvn28195"

RPM_NAME = "texlive-keyreader-2023.209.0.0.5bsvn28195-56.1.noarch.rpm"
RPM_HASH = "16d9ed2dc7cbdfbb19db6595997fb12fc2360428b3107b7153137204bc797b9b47739a6e38301e6a7404d93cbbd48ba189ed474a78e30059cd860e2c62f967de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-keyreader.sty \
texlive-keyreader"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pdftexcmds.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
