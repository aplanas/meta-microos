SUMMARY = "Provides ancient Greek day and month names, dates, etcetera"
DESCRIPTION = "The package provides easy access to ancient Greek names of days \
and months of various regions of Greece. In case the historical \
information about a region is not complete, we use the Athenian \
name of the month. Moreover commands and options are provided, \
in order to completely switch to the 'ancient way', commands \
such as \\today."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-greekdates-2023.209.1.0svn15878-54.2.noarch.rpm"
RPM_HASH = "27e10081231ab138bf2a53b85c43cfb3c5fad0059241158fef62150cd511b6bf0246f920864f906963c073aabd7090df8ad80133b6285a0d713463e33966e62f"
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
