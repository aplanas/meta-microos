SUMMARY = "Reference items in a theorem environment"
DESCRIPTION = "The package provides the means to directly reference items of \
lists nested in theorem-like environments (e.g., as 'Theorem 1 \
a'). The package extends the ntheorem and cleveref packages. \
The package also provides other theorem markup commands."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn29062"

RPM_NAME = "texlive-coolthms-2023.209.1.2svn29062-55.1.noarch.rpm"
RPM_HASH = "ce1b35678de1f10a975b7d42266052f502d8ef45fb5da644ad36d252e83e3b2c07ebe7c5afbced06b4cb37cc5cdd694683afd516c487b12fc5510498ca433302"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-coolthms.sty \
texlive-coolthms"

RDEPENDS:${PN} += "/usr/bin/sh \
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
