SUMMARY = "Enhanced LaTeX integration for Bangla"
DESCRIPTION = "This package simplifies the process of writing Bangla in LaTeX \
and addresses most of the associated typesetting issues. \
Notable features: Automated transition from Bangla to English \
and vice versa. Patch for the unproportionate whitespace issue \
in popular Bangla fonts. Full support for all the common \
commands and environments. Bangla numbering for page, section, \
chapter, footnotes etc. (extending polyglossia's support). New \
theorem, problems, example, solution and other environments, \
all of which are in Bangla."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn55475"

RPM_NAME = "texlive-latexbangla-2023.209.0.0.2svn55475-55.1.noarch.rpm"
RPM_HASH = "ee726d2f3df94b370977ba0ad99cb589cc029e00163ede94e76d538d6f0153674f896eb3bc2aca2d63d0650f68a1c778a51766a59972ad002c12bcc2f8d6ef12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-latexbangla.sty \
texlive-latexbangla"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsfonts.sty \
tex-amsmath.sty \
tex-amssymb.sty \
tex-amsthm.sty \
tex-chngcntr.sty \
tex-enumerate.sty \
tex-fontspec.sty \
tex-hyperref.sty \
tex-ifxetex.sty \
tex-polyglossia.sty \
tex-titlesec.sty \
tex-ucharclasses.sty \
tex-xkeyval.sty \
tex-xpatch.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
