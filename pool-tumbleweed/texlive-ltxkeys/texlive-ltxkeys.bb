SUMMARY = "A robust key parser for LaTeX"
DESCRIPTION = "The package provides facilities for creating and managing keys \
in the sense of the keyval and xkeyval packages, but it is \
intended to be more robust and faster. Its robustness comes \
from its ability to preserve braces in key values throughout \
parsing. The need to preserve braces in key values arises often \
in parsing keys (for example, in the xwatermark package). The \
package is faster than xkeyval package because (among other \
things) it avoids character-wise parsing of key values (called \
'selective sanitization' by the xkeyval package). The package \
also provides functions for defining and managing keys."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.0.3csvn28332"

RPM_NAME = "texlive-ltxkeys-2023.208.0.0.0.3csvn28332-53.1.noarch.rpm"
RPM_HASH = "7d0bc29298a7fbfcfc56c6811b553f8d7993c45e006176aaee37a804faa017f78b2dc630c9308e1c8420eebdac572485e693c3e7979988873ce251c9dd3d8704"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ltxkeys.sty \
texlive-ltxkeys"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-catoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
