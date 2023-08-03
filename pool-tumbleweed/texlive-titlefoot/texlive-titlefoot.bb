SUMMARY = "Add special material to footer of title page"
DESCRIPTION = "Provides the capability of adding keywords (with a \\keywords \
command), a running title (\\runningtitle), AMS subject \
classifications (\\amssubj), and an 'author's footnote' as \
footnotes to the title or first page of a document. Works with \
any class for which the \\thanks macro works (e.g., article)."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-titlefoot-2023.209.svn15878-53.1.noarch.rpm"
RPM_HASH = "45ce27b82e0c646dfb50845c321f34f585ccb411cb21e4416a4e76343772d83f5ff9f0beebefa4137ded24aa9fd9f5f928dc64c261802c08e37660ff8e15e1e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-titlefoot.sty \
texlive-titlefoot"

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
