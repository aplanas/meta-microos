SUMMARY = "An extension of package changebar that can be used with XeLaTeX"
DESCRIPTION = "The package extends package changebar so it can be used with \
XeLaTeX. It introduces the new option xetex for use with \
XeLaTeX. Everything else remains the same and users should \
consult the original documentation for usage information."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn54080"

RPM_NAME = "texlive-xechangebar-2023.209.1.0svn54080-53.1.noarch.rpm"
RPM_HASH = "b5f93da56e04deb39a86fd03339df4aeebf3f00823f3af2556d125974ef27e1327672f2b9f0f2cc55a5e5dbbf26df04bde3786190e98579c67e8b4334d817ed6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xechangebar.sty \
texlive-xechangebar"

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
