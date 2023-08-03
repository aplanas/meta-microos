SUMMARY = "Typeset Japanese with pdfLaTeX and CJK"
DESCRIPTION = "The package provides a working configuration of the CJK \
package, suitable for Japanese typesetting of moderate quality. \
Moreover, it facilitates use of the CJK package for pLaTeX \
users, by providing commands that are similar to those used by \
the pLaTeX kernel and some other packages used with it."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn54080"

RPM_NAME = "texlive-bxcjkjatype-2023.209.0.0.3svn54080-53.1.noarch.rpm"
RPM_HASH = "fe2893a210f64c3264cc5925cf1ffb9dd4fcf9c798fccb3cef02ccda2e5222eccc5ca115d4d3e0438e176a4dc794f8ab90bbf6b3c66de9d43b23a791f198172f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bxcjkjatype.sty \
texlive-bxcjkjatype"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-CJK.sty \
tex-CJKpunct.sty \
tex-CJKspace.sty \
tex-CJKutf8.sty \
tex-CJKvert.sty \
tex-atbegshi.sty \
tex-etoolbox.sty \
tex-keyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
