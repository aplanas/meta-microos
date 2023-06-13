SUMMARY = "Draw continuum, emission and absorption spectra with PSTricks"
DESCRIPTION = "The package is a PSTricks extension, based on a NASA lines \
database. It allows you to draw continuum, emission and \
absorption spectra. A Total of 16 880 visible lines from 99 \
elements can be displayed. The package requires the xkeyval \
package for decoding its arguments."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.91svn15878"

RPM_NAME = "texlive-pst-spectra-2023.201.0.0.91svn15878-53.1.noarch.rpm"
RPM_HASH = "18920b34807666016695a8297360936221bebd3a3744f64ddfa282e8ab59c5fd03b353f77386d626d5c66e1c23f8d6aa146f1a406a4b44d55a34caa4d22990ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(pst-spectra.sty) \
tex(pst-spectra.tex) \
texlive-pst-spectra"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(multido.sty) \
tex(pstricks.sty) \
tex(xkeyval.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
