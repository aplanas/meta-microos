SUMMARY = "Typeset transform signs"
DESCRIPTION = "A package for typesetting various transformation signs for \
Laplace transforms, Fourier transforms and others."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.01svn15878"

RPM_NAME = "texlive-trfsigns-2023.201.1.01svn15878-52.1.noarch.rpm"
RPM_HASH = "ac7445361119a1f2e5c367b33103cd4a69697faece3e5ad93368a73ed31fecd263618379ce55afec5e7f32a92933fa45a15e7bff0d4d35c934c80af491d1c0ff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(trfsigns.sty) \
texlive-trfsigns"

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
