SUMMARY = "AMS document classes for LaTeX"
DESCRIPTION = "This bundle contains three AMS classes, amsart (for writing \
articles for the AMS), amsbook (for books) and amsproc (for \
proceedings), together with some supporting material. This \
material forms one branch of what was originally the AMS-LaTeX \
distribution. The other branch, amsmath, is now maintained and \
distributed separately. The user documentation can be found in \
the package amscls-doc."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.20.6svn55378"

RPM_NAME = "texlive-amscls-2023.209.2.20.6svn55378-55.1.noarch.rpm"
RPM_HASH = "0ce5f2a7339f02fffdafd2a3479a8de90724a1fcda731f5d60c3e36a1337aec84383f4d3910cfc841be8d035a7af5c17a3104521431445b01bc46274e5173e5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-amsart.cls \
tex-amsbook.cls \
tex-amsbooka.sty \
tex-amsdtx.cls \
tex-amsldoc.cls \
tex-amsmidx.sty \
tex-amsproc.cls \
tex-amsthm.sty \
tex-upref.sty \
texlive-amscls"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-book.cls \
tex-doc.sty \
tex-url.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
