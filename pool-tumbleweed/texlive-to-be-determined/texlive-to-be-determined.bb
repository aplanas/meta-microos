SUMMARY = "Highlight text passages that need further work"
DESCRIPTION = "This package provides a single command \\tbd which highlights \
the pieces of text that need to be rewritten later. You can \
hide them all with a single package option hide, or just make \
them disappear entirely with the option off."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3.0svn64882"

RPM_NAME = "texlive-to-be-determined-2023.209.0.0.3.0svn64882-53.1.noarch.rpm"
RPM_HASH = "1418bfd26b0ae303238c388d021a9dc33f424d7875771780198465aef8616ec163a5036147969d093dc0cbf71bdbf280444b9c49b65813428a5292cf2e2efdac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-to-be-determined.sty \
texlive-to-be-determined"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-soul.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-soul \
texlive-xcolor"

inherit rpm
