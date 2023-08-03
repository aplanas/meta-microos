SUMMARY = "Macros for commonly used physical constants"
DESCRIPTION = "This package consists of several macros that are shorthand for \
a variety of physical constants, e.g. the speed of light. The \
package developed out of physics and astronomy classes that the \
author has taught and wanted to ensure that he had correct \
values for each constant and did not wish to retype them every \
time he uses them. The constants can be used in two forms, the \
most accurate available values, or versions that are rounded to \
3 significant digits for use in typical classroom settings, \
homework assignments, etc. Most constants are taken from CODATA \
2018, with the exception of the astronomical objects, whose \
values are taken from International Astronomical Union \
specified values. Constants that are derived from true \
constants, e.g. the fine structure constant, have been \
calculated using the accepted values of the fundamental \
constants."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.2svn58727"

RPM_NAME = "texlive-physconst-2023.209.1.1.2svn58727-52.1.noarch.rpm"
RPM_HASH = "d7bd15ee331c956e781a479bd62222fe4b8df35077e7ed96a19804692c9564b9b03bc08ff60c88c2e8c10ff3a3c934b11310bdf18f66dc55de430febce7e00dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-physconst.sty \
texlive-physconst"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-physunits.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
