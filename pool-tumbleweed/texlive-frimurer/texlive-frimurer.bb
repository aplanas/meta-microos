SUMMARY = "Access to the 'frimurer' cipher for use with LaTeX"
DESCRIPTION = "This package provides access to the 'frimurer' cipher for use \
with LaTeX."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1svn56704"

RPM_NAME = "texlive-frimurer-2023.201.1svn56704-52.1.noarch.rpm"
RPM_HASH = "247dae4fff68ff7be1e213a36103ebaa154c7f1e37058764f8030e7a5702cf42ed1a0cd34aae6ca14a02b1c2076851726a03c0e423d5c1656d76750b49b6455f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-frimurer.enc \
tex-frimurer.sty \
tex-frimurer.tfm \
texlive-frimurer"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-frimurer-fonts \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
