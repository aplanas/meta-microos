SUMMARY = "A robust interface to xkeyval"
DESCRIPTION = "The package provides a robust interface to controlling keys in \
xkeyval, removing some of that package's restrictions. The \
package also addresses some of the issues now covered by the \
author's ltxkeys package, which was assumed to be a replacement \
for keyreader. Since keyreader has remained a favourite with \
users, it has been reinstated."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5bsvn28195"

RPM_NAME = "texlive-keyreader-2023.201.0.0.5bsvn28195-55.1.noarch.rpm"
RPM_HASH = "98f4f06a548956e23b14ddbd9f20d6aacd3777243cdb88ab75a3044d21abeb82ce6a83bac3cd7a163e6aeca7933c3cdde72dcc88824507aeaf32f8e3ec7dae4a"
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
