SUMMARY = "LaTeX support for section breaks"
DESCRIPTION = "This package provides LaTeX support for section breaks, used \
mainly in fiction books to signal changes in a story, like \
changes in time, location, etc. It supports the asterism \
symbol, text content, or custom macros as the section break \
mark symbol."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1dsvn50339"

RPM_NAME = "texlive-sectionbreak-2023.209.0.0.1dsvn50339-54.1.noarch.rpm"
RPM_HASH = "aea6df3627b3d5a77aa17056adfbc29b8b128a2e74254bee19cf421a6b9d780b449a5849e8aeb5e0a4eb1288e67fbdbcafe2ae1c196103982c165a18863c05c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-sectionbreak.sty \
texlive-sectionbreak"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
