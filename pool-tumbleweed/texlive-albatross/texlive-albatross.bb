SUMMARY = "Find fonts that contain a given glyph"
DESCRIPTION = "This is a command line tool for finding fonts that contain a \
given (Unicode) glyph. It relies on Fontconfig."
LICENSE = "BSD-3-Clause"

PV = "2023.201.0.0.5.0svn65647"

RPM_NAME = "texlive-albatross-2023.201.0.0.5.0svn65647-54.1.noarch.rpm"
RPM_HASH = "60fd95808d4c62f38b367a11025038baf1ca2e8916f99835b5efb0a6de36b93369f91e18fb266033fe2fcebfbfefd43b3973ea0ba34ba175903fb6f8e17327d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(albatross.jar) \
texlive-albatross"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
java \
sed \
texlive \
texlive-albatross-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
