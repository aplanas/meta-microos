SUMMARY = "Add special material to footer of title page"
DESCRIPTION = "Provides the capability of adding keywords (with a \\keywords \
command), a running title (\\runningtitle), AMS subject \
classifications (\\amssubj), and an 'author's footnote' as \
footnotes to the title or first page of a document. Works with \
any class for which the \\thanks macro works (e.g., article)."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-titlefoot-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "98ad6d4f84401801f38c09ff58d4ea59f3329b6fade6a8b7eb2a7e951fab96c8fb0209dbd2a428d078f53d178411ec4e8926ac39c01c70a696e42eba22c458c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(titlefoot.sty) \
texlive-titlefoot"
RDEPENDS:${PN} += "/bin/sh \
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
