SUMMARY = "PostScript picture support"
DESCRIPTION = "A replacement for LaTeX's picture macros, that uses PostScript \
\\special commands. The package is now largely superseded by \
pict2e."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-pspicture-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "b2b7a98c10b9390359af6ea84a8669595644865becf7694a5dde9de7331640a5974c220b5d596cf3073801188efbc329c0a64c7c0af24bc71e76743f045886f0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pspicture.sty \
texlive-pspicture"

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
