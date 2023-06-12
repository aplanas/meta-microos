SUMMARY = "Get package or file date"
DESCRIPTION = "The package can fetch the date declaration of packages and \
files used by a document, and then provide the information in \
macros. The facilities provide a means of obtaining the date of \
a package being documented; this is mainly of use when \
doc/docstrip."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-zwgetfdate-2023.201.svn15878-52.1.noarch.rpm"
RPM_HASH = "c6f6577ada9a3d2f180c9e09f03455cc313ee255016a61bbdb3b0dfd601bdb56ea247d9318b102d9ce35bcfd7a731879c60758ae3249bdd5fa7e04450a65ca25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(zwgetfdate.sty) \
texlive-zwgetfdate"
RDEPENDS:${PN} += "/bin/sh \
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
