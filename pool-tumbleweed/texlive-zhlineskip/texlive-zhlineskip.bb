SUMMARY = "Line spacing for CJK documents"
DESCRIPTION = "This package supports typesetting CJK documents. It allows \
users to specify the two ratios between the leading and the \
font size of the body text and the footnote text. For CJK \
typesetting, these ratios usually range from 1.5 to 1.67. This \
package is also capable of restoring the math leading to that \
of the Latin text (usually 1.2 times the font size). Finally, \
it is possible to achieve the Microsoft Word multiple line \
spacing style using zhlineskip."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0esvn51142"

RPM_NAME = "texlive-zhlineskip-2023.209.1.0esvn51142-53.1.noarch.rpm"
RPM_HASH = "3b7d3e49350751db6be4b5d5cf570f4774215696cb1a4b28167d1b79a306e985bba3ec11267036d6369051c76141966616b8d3c0401b67941dd90156dca26b32"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-zhlineskip.sty \
texlive-zhlineskip"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-kvoptions.sty \
tex-mathtools.sty \
tex-xintexpr.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
