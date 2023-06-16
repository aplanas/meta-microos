SUMMARY = "Abbreviations for typesetting (German) juridical documents"
DESCRIPTION = "This package should be helpful for people working on (German) \
law. It helps you to handle abbreviations and creates a list of \
those (pre-defined) abbreviations that have actually been used \
in the document"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-juraabbrev-2023.201.svn15878-55.1.noarch.rpm"
RPM_HASH = "c6829a385402e9f7132df43cb4b8509f24db4ce0818b546989fa79583fcd6806f97c26f89f12d79ed50745f4ad856601a5490446fc0398a4e940c98c2fb6993f"
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
