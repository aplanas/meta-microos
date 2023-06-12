SUMMARY = "Format captions inside multicols"
DESCRIPTION = "This is a package for formatting captions of column figures and \
column tabular material, which cannot be standard floats in a \
multicols environment. The package also provides a convenient \
way to customise your captions, whether they be in multicols or \
not."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-multicap-2023.201.svn15878-54.1.noarch.rpm"
RPM_HASH = "cf5d9990fd0236ae7600feb6bf14ad015e4939f34692e4338631f1b384ca589c9f43870e737c464bfae20122d84d70d44927a56f89af27a9b292da80e30196d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(multicap.sty) \
texlive-multicap"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifthen.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
