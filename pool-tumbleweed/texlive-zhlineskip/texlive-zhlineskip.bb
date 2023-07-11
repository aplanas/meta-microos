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

PV = "2023.201.1.0esvn51142"

RPM_NAME = "texlive-zhlineskip-2023.201.1.0esvn51142-52.2.noarch.rpm"
RPM_HASH = "8438cdc3d0bf50662e5a628442e22f0902933829a6731061a5a087b7a70ba2d02481803852ae2650029e9ef483c1226b6aa570394eca66606c4cd3035c9f481a"
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
