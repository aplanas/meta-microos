SUMMARY = "Font containing a set of web-related icons"
DESCRIPTION = "This package grants access to 336 web-related icons provided by \
the included 'Typicons' free font, designed by Stephen \
Hutchings and released under the SIL Open Font License. See \
http://www.typicons.com for more details about the font itself. \
This package requires the fontspec package and either the \
Xe(La)TeX or Lua(La)TeX engine to load the included ttf font. \
Once the package is loaded, icons can be accessed through the \
general \\ticon command, which takes as argument the name of the \
desired icon, or through direct commands specific to each icon. \
The full list of icon designs, names and direct commands is \
showcased in the manual."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0.7svn37623"

RPM_NAME = "texlive-typicons-2023.209.2.0.7svn37623-53.1.noarch.rpm"
RPM_HASH = "c25f646a3e91fdacc35ad50018ba104517da5b109a7e88862346017c11855427438cf2e387f411e39b236c4122d534b4a96fc51a9694fc3faae32b1827dd5858"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-typicons.sty \
texlive-typicons"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fontspec.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-typicons-fonts"

inherit rpm
