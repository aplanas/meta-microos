SUMMARY = "Reference items in a theorem environment"
DESCRIPTION = "The package provides the means to directly reference items of \
lists nested in theorem-like environments (e.g., as 'Theorem 1 \
a'). The package extends the ntheorem and cleveref packages. \
The package also provides other theorem markup commands."
LICENSE = "LPPL-1.0"

PV = "2023.204.1.2svn29062"

RPM_NAME = "texlive-coolthms-2023.204.1.2svn29062-54.1.noarch.rpm"
RPM_HASH = "2f13756aee1366670b37aa4478d6215fc826a72b9719cf2696a41f0e0320429f92ba93bdf2a2012fb9af94ecbe9ca62414b7c08f89a4785644678e9b9c8c4b62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-coolthms.sty \
texlive-coolthms"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-cleveref.sty \
tex-etoolbox.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-kvoptions.sty \
tex-letltxmacro.sty \
tex-ntheorem.sty \
tex-scrbase.sty \
tex-xargs.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
