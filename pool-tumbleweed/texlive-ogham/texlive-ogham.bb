SUMMARY = "Fonts for typesetting Ogham script"
DESCRIPTION = "The font provides the Ogham alphabet, which is found on a \
number of Irish and Pictish carvings dating from the 4th \
century AD. The font is distributed as Metafont source, which \
has been patched (with the author's permission) for stability \
at different output device resolutions. (Thanks are due to \
Peter Flynn and Dan Luecking.)"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn24876"

RPM_NAME = "texlive-ogham-2023.201.svn24876-54.1.noarch.rpm"
RPM_HASH = "d0044138da1e00c9d91ff11bff94d4ac906bba23145287a3c8e36d883812c04c6d685536e5f77f71c56e46c734f38fa4cfce935b45c14b78bc00a748530ccc52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ogham.tfm) \
texlive-ogham"

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
