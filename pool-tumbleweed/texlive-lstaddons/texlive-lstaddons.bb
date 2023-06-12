SUMMARY = "Add-on packages for listings: autogobble and line background"
DESCRIPTION = "The bundle contains a small collection of add-on packages for \
the listings package. Current packages are: lstlinebgrd: colour \
the background of some or all lines of a listing; and \
lstautogobble: set the standard 'gobble' option to the indent \
of the first line of the code."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn64967"

RPM_NAME = "texlive-lstaddons-2023.201.0.0.1svn64967-52.1.noarch.rpm"
RPM_HASH = "4efc54f4233bff27544b542cc8d7c8ba86936df149dc72231b7cf2f090526736a68a084e239969176d5f3f026f67bb68071c52a3ba7affc4d33c04d2bf014a51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(lstautogobble.sty) \
tex(lstlinebgrd.sty) \
texlive-lstaddons"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(listings.sty) \
tex(xcolor.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
