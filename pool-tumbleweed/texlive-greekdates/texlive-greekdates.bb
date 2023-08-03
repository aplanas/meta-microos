SUMMARY = "Provides ancient Greek day and month names, dates, etcetera"
DESCRIPTION = "The package provides easy access to ancient Greek names of days \
and months of various regions of Greece. In case the historical \
information about a region is not complete, we use the Athenian \
name of the month. Moreover commands and options are provided, \
in order to completely switch to the 'ancient way', commands \
such as \\today."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-greekdates-2023.209.1.0svn15878-54.1.noarch.rpm"
RPM_HASH = "687f432a2ccd38baeae2ec8490b4202626a46ade5abdc6b197821a9049a9cc807aa7121721406021ef0d414b4a25f2f0be951ab32e34be0a5122ce3183f867f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-greekdates.sty \
texlive-greekdates"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
