SUMMARY = "Typeset Begriffschrift"
DESCRIPTION = "The package defines maths mode commands for typesetting Frege's \
Begriffschrift."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.6svn15878"

RPM_NAME = "texlive-begriff-2023.209.1.6svn15878-54.1.noarch.rpm"
RPM_HASH = "e0bb61a0d74e4b025e48597a47a228f3c812e534df5dc53594023ec22e64987a927f9851d8d2faabf52965c0357803fb25d61b8a0bc89cd4f932876dbb9750c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-begriff.sty \
texlive-begriff"

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
