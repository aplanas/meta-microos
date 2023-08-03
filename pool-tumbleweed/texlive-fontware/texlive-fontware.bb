SUMMARY = "Tools for virtual font metrics"
DESCRIPTION = "Virtual font metrics are usually created in a textual form, the \
Virtual Property List, but programs that use them need to use \
binary files (the Virtual Font and the TeX Font Metric). The \
present two programs translate between the two forms: - vptovf \
takes a VPL file and generates a VF file and a TFM file; - \
vftovp takes a VF file and a TFM file and generates a VPL file. \
The programs are to be found in every distribution of TeX."
LICENSE = "SUSE-TeX"

PV = "2023.209.svn66186"

RPM_NAME = "texlive-fontware-2023.209.svn66186-53.1.noarch.rpm"
RPM_HASH = "3bca63ed5c9561d5bd38070400d41bc564e578ff2eaf048a059641921a08aff03feda2bcf43e2e33bf4aec550a3c04f0cc91eefd35ff74a269de26054470d69f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-pltotf.1 \
man-tftopl.1 \
man-vftovp.1 \
man-vptovf.1 \
texlive-fontware"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-fontware-bin \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
