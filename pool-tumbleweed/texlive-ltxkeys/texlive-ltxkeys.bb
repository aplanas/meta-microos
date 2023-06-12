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

PV = "2023.201.0.0.0.3csvn28332"

RPM_NAME = "texlive-ltxkeys-2023.201.0.0.0.3csvn28332-52.1.noarch.rpm"
RPM_HASH = "811b3d9f2a0c1fe30cec2c20e1d417cb7bad3645dc60870ce00982fec7efe493999b503d4330d8debfe9c092e4cbd03f4f5aaf7537fc29717768b90314fca0b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ltxkeys.sty) \
texlive-ltxkeys"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(catoptions.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
