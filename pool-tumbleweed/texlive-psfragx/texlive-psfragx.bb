SUMMARY = "A psfrag eXtension"
DESCRIPTION = "PSfragX offers a mechanism to embed \\psfrag commands, as \
provided by the psfrag package, into the EPS file itself. Each \
time a graphic is included, the EPS file is scanned. If some \
tagged lines are found, they are used to define the psfrag \
replacements that should be performed automatically. In \
addition, a similar mechanism holds for overpic objects. These \
are picture objects superimposed on the included graphic. A \
similar mechanism is implemented in psfrag itself (but \
deprecated in the documentation), but psfragx offers much more \
flexibility. For example, if babel is used, it is possible to \
define different replacements corresponding to different \
languages. The replacements to take into account will be \
selected on the basis of the current language of the document. \
A Matlab script (LaPrint) is provided, to export an EPS file \
with psfragx annotations ready embedded."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn26243"

RPM_NAME = "texlive-psfragx-2023.201.1.1svn26243-52.1.noarch.rpm"
RPM_HASH = "c6595ced1f6a67ba47ea75c2150ad6295ca88a4326708895789e8501070fca443644eaa904e7cd8c5e1e526720cd2c26ee2a60dfab7ff62dd3ba310d9bb8c564"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-psfragx.cfg \
tex-psfragx.sty \
texlive-psfragx"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-graphicx.sty \
tex-overpic.sty \
tex-psfrag.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
