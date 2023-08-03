SUMMARY = "Examples from the KOMA-Script book"
DESCRIPTION = "This package contains some examples from the 6th edition of the \
book >>KOMA-Script<<, >>Eine Sammlung von Klassen und Paketen \
fur LaTeX2e<< by Markus Kohm, published by Lehmanns Media. \
There are no further descriptions of these examples."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn63833"

RPM_NAME = "texlive-koma-script-examples-2023.209.svn63833-56.1.noarch.rpm"
RPM_HASH = "22377241e31ad736d32ebb4de98d368d5a2bb7fd0fabea375403e5a35c8030282938301def84653330f5de7a903a8934e461724034bb4d22fbf33b02f9feeb83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-koma-script-examples"

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
