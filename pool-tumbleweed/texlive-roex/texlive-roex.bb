SUMMARY = "Metafont-PostScript conversions"
DESCRIPTION = "A Metafont support package including: epstomf, a tiny AWK \
script for converting EPS files into Metafont; mftoeps for \
generating (encapsulated) PostScript files readable, e.g., by \
CorelDRAW, Adobe Illustrator and Fontographer; a collection of \
routines (in folder progs) for converting Metafont-coded \
graphics into encapsulated PostScript; and roex.mf, which \
provides Metafont macros for removing overlaps and expanding \
strokes. In mftoeps, Metafont writes PostScript code to a \
log-file, from which it may be extracted by either TeX or AWK."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn45818"

RPM_NAME = "texlive-roex-2023.209.svn45818-54.1.noarch.rpm"
RPM_HASH = "eed685609ee20e0ca15234a0bf0647af17c43af8230c98991a729c3b59f1761816c5637d942ce18755b762efbde2dcdedff9b949710c63549dfb4474e7ee58cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-roex"

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
