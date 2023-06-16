SUMMARY = "Visualize shares of total amounts in the form of a (progress-)bar"
DESCRIPTION = "This package allows you to easily visualize shares of total \
amounts in the form of a bar. So basically you can convert any \
number between 0 and 1 to a progressbar using the command \
\\progressbar{<number>}. Also a lot of customizations are \
possible, allowing you to create an unique progressbar on your \
own. The package uses TikZ to produce its graphics."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0b_4svn33822"

RPM_NAME = "texlive-progressbar-2023.201.1.0b_4svn33822-52.1.noarch.rpm"
RPM_HASH = "320309ee7705fa48608f4040de59d156d41e10f148e13ad35b69420d65d41e085a63978099516ce852e311259f698b3330a10516288f3b22ed843178a29c07e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-progressbar.sty \
texlive-progressbar"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-kvoptions.sty \
tex-kvsetkeys.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
