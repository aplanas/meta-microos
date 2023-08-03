SUMMARY = "MetaPost macros for highly configurable rounded rectangles (optionally with text)"
DESCRIPTION = "The roundrect macros for MetaPost provide ways to produce \
rounded rectangles, which may or may not contain a title bar or \
text (the title bar may itself contain text). They are \
extremely configurable."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.2svn39796"

RPM_NAME = "texlive-roundrect-2023.209.2.2svn39796-54.1.noarch.rpm"
RPM_HASH = "46c3174d2e137ed86564f0f30c092a9b36721e5c8702530d094c3a4f9a34b2876dfbd28978534f63dccce1c59af9d72a7d57aabbfb0fff93f3a4a8409f206a0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-roundrect"

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
