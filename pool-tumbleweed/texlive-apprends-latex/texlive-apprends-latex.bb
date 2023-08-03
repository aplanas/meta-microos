SUMMARY = "Apprends LaTeX!"
DESCRIPTION = "Apprends LaTeX! ('Learn LaTeX', in English) is French \
documentation for LaTeX beginners."
LICENSE = "LPPL-1.0"

PV = "2023.209.4.02svn19306"

RPM_NAME = "texlive-apprends-latex-2023.209.4.02svn19306-55.1.noarch.rpm"
RPM_HASH = "ad02521600f41a2724afe39a1636abc564ceebd6d5c0a5dcc83130375d7541e6207229c0ef1ed8212c195dc5c5c15d9d1f6b2c532a99e07b0fbdd901e14afb5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-apprends-latex"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
