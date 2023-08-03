SUMMARY = "A package to typeset quotations easier"
DESCRIPTION = "The package provides a macro to typeset quotations, using the \
command \\say{stuff}. The quotation mark glyphs are inserted by \
the macro; nested quotations are detected."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.0svn20520"

RPM_NAME = "texlive-dirtytalk-2023.209.1.0svn20520-53.1.noarch.rpm"
RPM_HASH = "053b0b51b6dbb3c528c833266730a304eae6c9888417f9298e782049678303fe2e1d930dad2a5827d10747f42774e22afedbfb8af348048ba325702bdec10cd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dirtytalk.sty \
texlive-dirtytalk"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
