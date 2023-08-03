SUMMARY = "Macros for 'Progress of Theoretical Physics'"
DESCRIPTION = "The distribution contains the class (which offers an option \
file for preprints), and a template. The class requires the \
cite, overcite and wrapfig packages."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.91svn19440"

RPM_NAME = "texlive-ptptex-2023.209.0.0.91svn19440-54.1.noarch.rpm"
RPM_HASH = "8f40c19630a27d8c8ae64fb0b9246c8c8b8053fc25244ff447eaa58047cd36e4deeb1e127094fbd0e423935f046268c63f33198db163c54f7dc174ad9def68eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ptp-prep.clo \
tex-ptptex.cls \
tex-wrapft.sty \
texlive-ptptex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-amssymb.sty \
tex-overcite.sty \
tex-wrapfig.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
