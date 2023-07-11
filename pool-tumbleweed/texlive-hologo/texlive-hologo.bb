SUMMARY = "A collection of logos with bookmark support"
DESCRIPTION = "The package defines a single command \\hologo, whose argument is \
the usual case-confused ASCII version of the logo. The command \
is bookmark-enabled, so that every logo becomes available in \
bookmarks without further work."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.15svn61719"

RPM_NAME = "texlive-hologo-2023.201.1.15svn61719-53.2.noarch.rpm"
RPM_HASH = "35c8132ec2adf8da65f168bc4fdf02f2f45b03e700613c9c5953dde0608cc50ade703130e6744eead4927f8332dfa2b7d2ecbbaa1c6cc46676321cc861ceff6c"
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
