SUMMARY = "Manipulate the graphics package's list of extensions"
DESCRIPTION = "This package provides macros for adding to, and reordering the \
list of graphics file extensions recognised by package \
graphics."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3svn53024"

RPM_NAME = "texlive-grfext-2023.201.1.3svn53024-53.2.noarch.rpm"
RPM_HASH = "5dadba1d05d6a2181c3453ed1b9b8ae6f99fcea1f12aa1dbe08785b1f460fa4f7c1e0a93cf402272ff62dd465487949f69b5a4e77a1037e62bb164357551b3ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-grfext.sty \
texlive-grfext"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-infwarerr.sty \
tex-kvdefinekeys.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
