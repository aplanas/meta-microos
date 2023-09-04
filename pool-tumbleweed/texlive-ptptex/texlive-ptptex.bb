SUMMARY = "Macros for 'Progress of Theoretical Physics'"
DESCRIPTION = "The distribution contains the class (which offers an option \
file for preprints), and a template. The class requires the \
cite, overcite and wrapfig packages."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.91svn19440"

RPM_NAME = "texlive-ptptex-2023.209.0.0.91svn19440-54.2.noarch.rpm"
RPM_HASH = "a9f2c46be4c173a0908d41ed3792a7132d8a8fb96c1ae198cf0fbea933fe7069ab92cf1f3de05c4bc0011cc3207cfbee6f22cb7f20871d9efe147e23be4d0ef2"
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
