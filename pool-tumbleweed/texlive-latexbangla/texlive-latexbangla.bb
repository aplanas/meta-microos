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

PV = "2023.201.0.0.2svn55475"

RPM_NAME = "texlive-latexbangla-2023.201.0.0.2svn55475-54.1.noarch.rpm"
RPM_HASH = "949966e2b7f773064bd0cfa3656b6cf512a195b386d338d2b7feeaba9aa1ca4611bdc86795e098f935c8d0a13a99754f96f44e0f7cd72ab76acdfc311b5e8cd0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-latexbangla.sty \
texlive-latexbangla"

RDEPENDS:${PN} += "/bin/sh \
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
