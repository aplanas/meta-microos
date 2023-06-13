SUMMARY = "Functions and objects for the computation of physical quantities"
DESCRIPTION = "This is a pure Lua library, which provides functions and \
objects for the computation of physical quantities. The package \
provides units of the SI and the imperial system. In order to \
display the numbers with measurement uncertainties, the package \
is able to perform Gaussian error propagation."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.5svn59138"

RPM_NAME = "texlive-lua-physical-2023.201.1.0.5svn59138-52.1.noarch.rpm"
RPM_HASH = "9f7f2d96f61009ef7cbd81bc7856390f95fef5f7f87f7754392855e33099cfbf7ffb3738e434ac1f5d40e86995d9156486682c8d9f5d52fb9dccd2fbb3f6ef0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lua-physical"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/luatex \
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
