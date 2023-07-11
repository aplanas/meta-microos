SUMMARY = "Emulation of obsolete package for 'here' floats"
DESCRIPTION = "Provides the H option for floats in LaTeX to signify that the \
environment is not really a float (and should therefore be \
placed 'here' and not float at all). The package emulates an \
older package of the same name, which has long been suppressed \
by its author. The job is done by nothing more than loading the \
float package, which has long provided the option in an \
acceptable framework."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn16135"

RPM_NAME = "texlive-here-2023.201.svn16135-53.2.noarch.rpm"
RPM_HASH = "dc5843569334427d47aa7d725cf237db65f170b1dbbc2533614a7b49c3bf560274cd41b825c2054c6daf33209dbb54f9bf5dd61e4f462c9588a95d9ff8181092"
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
