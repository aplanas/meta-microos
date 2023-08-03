SUMMARY = "Abbreviations for typesetting (German) juridical documents"
DESCRIPTION = "This package should be helpful for people working on (German) \
law. It helps you to handle abbreviations and creates a list of \
those (pre-defined) abbreviations that have actually been used \
in the document"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-juraabbrev-2023.209.svn15878-56.1.noarch.rpm"
RPM_HASH = "47151a4a6b4cdb080bddf2705c28434ec37a0f426a47272f52dc8f4b4c14e397f5f5c9fdd0305226063e1f08f57ee5fa4054cd2b9bc496d963f678ce54840e60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-juraabbrev.sty \
texlive-juraabbrev"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
