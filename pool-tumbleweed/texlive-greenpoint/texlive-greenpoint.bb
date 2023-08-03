SUMMARY = "The Green Point logo"
DESCRIPTION = "A Metafont-implementation of the logo commonly known as 'Der \
Grune Punkt' ('The Green Point'). In Austria, it can be found \
on nearly every bottle. It should not be confused with the \
'Recycle'-logo, implemented by Ian Green."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-greenpoint-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "f7bb2a681b850d2a5b33d318bc02b7efc52991c08eec4117db5b7be8637db681b358d512bcf759f09a375bb6403c5dc1c5b40e95be24051c44401f13a4d01db2"
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
