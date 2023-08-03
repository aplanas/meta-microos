SUMMARY = "A collection of logos with bookmark support"
DESCRIPTION = "The package defines a single command \\hologo, whose argument is \
the usual case-confused ASCII version of the logo. The command \
is bookmark-enabled, so that every logo becomes available in \
bookmarks without further work."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.15svn61719"

RPM_NAME = "texlive-hologo-2023.209.1.15svn61719-54.1.noarch.rpm"
RPM_HASH = "6ce80f50e935937fb144a374c9ef3cc4549a6aefc90fe6386ef081fac939254d6e339e6749871f30fb522081f08a3e8b554762b7a749dc1295df95b04fdea677"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hologo.sty \
texlive-hologo"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-infwarerr.sty \
tex-kvdefinekeys.sty \
tex-kvoptions.sty \
tex-kvsetkeys.sty \
tex-ltxcmds.sty \
tex-pdftexcmds.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
