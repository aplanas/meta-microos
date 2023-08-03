SUMMARY = "Babel support for Scottish Gaelic"
DESCRIPTION = "The package provides the language definition file for support \
of Gaidhlig (Scottish Gaelic) in babel. Some shortcuts are \
defined, as well as translations of standard 'LaTeX names'."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0gsvn30289"

RPM_NAME = "texlive-babel-scottish-2023.209.1.0gsvn30289-54.1.noarch.rpm"
RPM_HASH = "135bddd3876ce5c0456e41c98073fcaa457b69501c525d1f34e10d6fdc8e3436acc801315aeaa02024183db1b238946fb36f45d70796c541116e9e3aa0d47e1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-scottish.ldf \
texlive-babel-scottish"

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
