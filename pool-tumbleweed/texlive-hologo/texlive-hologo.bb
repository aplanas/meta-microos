SUMMARY = "A collection of logos with bookmark support"
DESCRIPTION = "The package defines a single command \\hologo, whose argument is \
the usual case-confused ASCII version of the logo. The command \
is bookmark-enabled, so that every logo becomes available in \
bookmarks without further work."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.15svn61719"

RPM_NAME = "texlive-hologo-2023.209.1.15svn61719-54.2.noarch.rpm"
RPM_HASH = "d1c8536f02e81dc03466baa13681e637860e9f0dec083a8405eab28b61edf847a5ce4bac96d1c7715e2eeb0ac19347a511752d9e5afb650ea7a039b28d1111ed"
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
