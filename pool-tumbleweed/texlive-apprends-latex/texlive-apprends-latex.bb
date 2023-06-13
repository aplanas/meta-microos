SUMMARY = "Apprends LaTeX!"
DESCRIPTION = "Apprends LaTeX! ('Learn LaTeX', in English) is French \
documentation for LaTeX beginners."
LICENSE = "LPPL-1.0"

PV = "2023.201.4.02svn19306"

RPM_NAME = "texlive-apprends-latex-2023.201.4.02svn19306-54.1.noarch.rpm"
RPM_HASH = "b676098aa7d75576dd67dd685e3dc123cb3192bdbdb167c1dc59933c26c650ffff6877ec311e5b54ae880aafe51df06a37d1ccf05cb6cf97629fed75e9be6f82"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-apprends-latex"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
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
