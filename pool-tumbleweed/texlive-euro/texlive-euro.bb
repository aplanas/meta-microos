SUMMARY = "Provide Euro values for national currency amounts"
DESCRIPTION = "Converts arbitrary national currency amounts using the Euro as \
base unit, and typesets monetary amounts in almost any desired \
way. Write, e.g., \\ATS{17.6} to get something like '17,60 oS \
(1,28 Euro)' automatically. Conversion rates for the initial \
Euro-zone countries are already built-in. Further rates can be \
added easily. The package uses the fp package to do its sums."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn22191"

RPM_NAME = "texlive-euro-2023.209.1.1svn22191-53.1.noarch.rpm"
RPM_HASH = "7863683c226226b60f77cfceac7960960a77b80f239ad76de49016bc326dd7d9e4c219d62ba0adc39180fa674c2bee5f43ff20a3fdcc3a57163eba95ea00ba1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-euro.sty \
texlive-euro"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fp-basic.sty \
tex-fp-snap.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
