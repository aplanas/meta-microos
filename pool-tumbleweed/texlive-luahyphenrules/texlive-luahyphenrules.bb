SUMMARY = "Loading patterns in LuaLaTeX with language.dat"
DESCRIPTION = "Preloading hyphenation patterns (or 'hyphen rules.) into any \
format based upon LuaTeX is not required in LuaTeX and recent \
releases of babel don't do it anyway. This package is addressed \
to those who just want to select the languages and load their \
patterns by means of `language.dat` without loading `babel`."
LICENSE = "LPPL-1.0"

PV = "2023.208.1.1svn56200"

RPM_NAME = "texlive-luahyphenrules-2023.208.1.1svn56200-53.1.noarch.rpm"
RPM_HASH = "a9ab71a58edd76b900577dcfab4e155eb7a32c493d2c7edee3a81ed8e059379c0bd28da2de2ecb175aebe15b59f8534b1a8f549efb21799ab5a284a7c9f8cffa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-luahyphenrules.sty \
texlive-luahyphenrules"

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
