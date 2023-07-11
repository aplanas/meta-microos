SUMMARY = "Add-on packages for listings: autogobble and line background"
DESCRIPTION = "The bundle contains a small collection of add-on packages for \
the listings package. Current packages are: lstlinebgrd: colour \
the background of some or all lines of a listing; and \
lstautogobble: set the standard 'gobble' option to the indent \
of the first line of the code."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.1svn64967"

RPM_NAME = "texlive-lstaddons-2023.208.0.0.1svn64967-53.1.noarch.rpm"
RPM_HASH = "95bc9a694ab68a4639bc4af474ee20c31e8fa54d32150eddfd65de20b1d64f1b6448330ca046ad15744e6d5a384450bea7c2cad8a9eda90ea2026a9c11810ede"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-lstautogobble.sty \
tex-lstlinebgrd.sty \
texlive-lstaddons"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-listings.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
