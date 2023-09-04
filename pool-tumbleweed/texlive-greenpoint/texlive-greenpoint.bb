SUMMARY = "The Green Point logo"
DESCRIPTION = "A Metafont-implementation of the logo commonly known as 'Der \
Grune Punkt' ('The Green Point'). In Austria, it can be found \
on nearly every bottle. It should not be confused with the \
'Recycle'-logo, implemented by Ian Green."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-greenpoint-2023.209.svn15878-54.2.noarch.rpm"
RPM_HASH = "9c9e43a082fb2899d52b22c39a3d47bb6dc7c0d644ec85f7ae27779fb135e1cbab9234471bd448d7d1a3bd1fa46d1eb5debdb41833682b22b2bc97095b049b0f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-greenpoint.tfm \
texlive-greenpoint"

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
