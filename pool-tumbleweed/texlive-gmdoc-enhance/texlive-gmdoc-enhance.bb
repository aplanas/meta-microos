SUMMARY = "Some enhancements to the gmdoc package"
DESCRIPTION = "This package provides some enhancements for the gmdoc package: \
nicer formatting for multiple line inline comments, an ability \
to 'comment out' some code, and a macro to input other files in \
'normal' LaTeX mode."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn15878"

RPM_NAME = "texlive-gmdoc-enhance-2023.209.0.0.2svn15878-54.2.noarch.rpm"
RPM_HASH = "227eaa6d6f088c1535249120a47081d39ca345be0c8fdd7d335e3702689d9d3bf0ff918ab663dc634e83bed8dba4fa33a84379754278f59b8f62cac238289353"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-gmdoc-enhance.sty \
texlive-gmdoc-enhance"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-gmdoc.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
