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

RPM_NAME = "texlive-zhlineskip-2023.209.1.0esvn51142-53.2.noarch.rpm"
RPM_HASH = "93fb30a3d7279fca4d940eab81daa932fb378c5a39c9098e35aa917fd7562715bfdddc638bdb00c22c55d1077cc2c5c0c4c0abe31d3c0a238f00b02437e3577e"
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
