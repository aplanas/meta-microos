SUMMARY = "Support for typesetting bagpipe music"
DESCRIPTION = "Typesetting bagpipe music in MusixTeX is needlessly tedious. \
This package provides specialized and re-defined macros to \
simplify this task."
LICENSE = "LPPL-1.0"

PV = "2023.201.3.02svn34393"

RPM_NAME = "texlive-bagpipe-2023.201.3.02svn34393-53.1.noarch.rpm"
RPM_HASH = "7573c6e7e281dcef1278151ba45fe9eaf6aebabc382a42cb19d46b69f609db93d5b5a11b1626fd378001f04247150b0d106c822f5720e22766f3e7361af2752e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(bagpipe.tex) \
texlive-bagpipe"
RDEPENDS:${PN} += "/bin/sh \
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
