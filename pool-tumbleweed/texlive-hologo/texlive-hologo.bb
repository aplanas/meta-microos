SUMMARY = "A collection of logos with bookmark support"
DESCRIPTION = "The package defines a single command \\hologo, whose argument is \
the usual case-confused ASCII version of the logo. The command \
is bookmark-enabled, so that every logo becomes available in \
bookmarks without further work."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.15svn61719"

RPM_NAME = "texlive-hologo-2023.201.1.15svn61719-53.1.noarch.rpm"
RPM_HASH = "d632d5e427846a92c857233a1f3cdbe5fb08ecd2976a29dc068896d6cdcfa9a77e0021b7ac25ebcc2ce14e51f22c45416b3304676803ca1960f802c6bdd52348"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(hologo.sty) \
texlive-hologo"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(iftex.sty) \
tex(infwarerr.sty) \
tex(kvdefinekeys.sty) \
tex(kvoptions.sty) \
tex(kvsetkeys.sty) \
tex(ltxcmds.sty) \
tex(pdftexcmds.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
