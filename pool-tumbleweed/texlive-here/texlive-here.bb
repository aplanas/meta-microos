SUMMARY = "Emulation of obsolete package for 'here' floats"
DESCRIPTION = "Provides the H option for floats in LaTeX to signify that the \
environment is not really a float (and should therefore be \
placed 'here' and not float at all). The package emulates an \
older package of the same name, which has long been suppressed \
by its author. The job is done by nothing more than loading the \
float package, which has long provided the option in an \
acceptable framework."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn16135"

RPM_NAME = "texlive-here-2023.209.svn16135-54.2.noarch.rpm"
RPM_HASH = "65e4577f166522b9de23f64673b458ae0210de027a1a0f9438ceb28b0931d4a5636cecb5b25d0fbdf349b1cbe232b7aed23cd181300c8cf221459739e63254d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-here.sty \
texlive-here"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-float.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
