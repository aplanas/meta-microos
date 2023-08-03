SUMMARY = "A BibTeX style for the journal 'Biology Letters'"
DESCRIPTION = "This package provides a BibTeX style (.bst) file for the \
journal 'Biology Letters' published by the Royal Society. This \
style was produced independently and hence has no formal \
approval from the Royal Society."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn66115"

RPM_NAME = "texlive-biolett-bst-2023.209.svn66115-53.1.noarch.rpm"
RPM_HASH = "bf6e417b37433ad3ff97666a33046ee6ecc319f96f7338e60582aa6c082060f523998e2f4356a3df0663aff78e27039773db988fc29e7c72ecbc7e68ea8169d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biolett-bst"

RDEPENDS:${PN} += "/usr/bin/sh \
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
