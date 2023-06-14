SUMMARY = "Provides ancient Greek day and month names, dates, etcetera"
DESCRIPTION = "The package provides easy access to ancient Greek names of days \
and months of various regions of Greece. In case the historical \
information about a region is not complete, we use the Athenian \
name of the month. Moreover commands and options are provided, \
in order to completely switch to the 'ancient way', commands \
such as \\today."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-greekdates-2023.201.1.0svn15878-53.1.noarch.rpm"
RPM_HASH = "bf0f9157833325d75af8c1e7c4e2d640a5719104dbbfe9563fe29e9434578ff5f590e1c36ed641adb2ab7cb96a57bd7570031f0a1ae27a39eda30bac371ba436"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-greekdates.sty \
texlive-greekdates"

RDEPENDS:${PN} += "/bin/sh \
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
