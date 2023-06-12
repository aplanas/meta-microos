SUMMARY = "Provides an At-Begin-Page hook"
DESCRIPTION = "Using the \\AtBeginPage hook, you can add material in the \
background of a page. \\PageLayout can be used to give page \
makeup commands to be executed on every page (e.g., depending \
on the page style)."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.02svn17062"

RPM_NAME = "texlive-bophook-2023.201.0.0.02svn17062-52.1.noarch.rpm"
RPM_HASH = "fc4602ec5135477918426c2434dd615cf222a60db209184f0f63bd30d4400c30c82f9f386b772a678bc8c9ec6756e3b5c69688ef9a51bedd851958aca41f9b4d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bophook.sty) \
texlive-bophook"
RDEPENDS:${PN} += "/bin/sh \
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
