SUMMARY = "Incremental slides"
DESCRIPTION = "This package allows to write presentations with incremental \
slides. It does not presuppose any specific document class. \
Rather, it is a lightweight alternative to full-fledged \
presentation classes like beamer. The package requires xcolor, \
environ, and pgffor (from the pgf bundle)."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.12svn57866"

RPM_NAME = "texlive-overlays-2023.209.2.12svn57866-52.1.noarch.rpm"
RPM_HASH = "13889d424958e96a367f3038c74617094009238ce77109d37a6efc67607ccfd8a54ae9114f08cd05da75fed4b102762f70344974a740e94c446567bfaed10d49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-overlays.sty \
texlive-overlays"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-environ.sty \
tex-pgffor.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
