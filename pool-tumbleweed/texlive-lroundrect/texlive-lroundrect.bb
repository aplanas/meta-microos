SUMMARY = "LaTeX macros for utilizing the roundrect MetaPost routines"
DESCRIPTION = "This LaTeX package provides ways to use the extremely \
configurable rounded rectangles of the roundrect MetaPost \
package with LaTeX. It is chiefly useful for examples, but also \
has macros for particular types of boxes which are useful on \
their own."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn39804"

RPM_NAME = "texlive-lroundrect-2023.209.1.0svn39804-55.1.noarch.rpm"
RPM_HASH = "4ebb23b949d423be52ee9d6d1ee8e4b0a6a62f1e4713a369bb9e5fffbc4d5f6f037f0d04f8f41a848f26f309da10291ae67970086eac630e7f16b882bcd4e864"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lroundrect.sty \
texlive-lroundrect"

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
