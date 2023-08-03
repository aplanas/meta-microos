SUMMARY = "BibTeX style for AAAI"
DESCRIPTION = "A BibTeX style derived from the standard master, presumably for \
use with the aaai package."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn52470"

RPM_NAME = "texlive-aaai-named-2023.209.svn52470-55.1.noarch.rpm"
RPM_HASH = "c620234cea2bda37ce0198debd1b5a5402703628b56fca163b25b0988f50944f454ea3082e221e63384457bdcf3c41d1e3577ab3bd9b0417ef607ad5da9f7188"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-aaai-named"

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
