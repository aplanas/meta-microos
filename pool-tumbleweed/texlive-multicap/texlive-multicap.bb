SUMMARY = "Format captions inside multicols"
DESCRIPTION = "This is a package for formatting captions of column figures and \
column tabular material, which cannot be standard floats in a \
multicols environment. The package also provides a convenient \
way to customise your captions, whether they be in multicols or \
not."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-multicap-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "7727675580a4109965e807fec400e895e04017a2cf226b536384c36eb756c23fac8ce5b08de5a0498d2f3ccc76268912c77f1bb9ab11c6589b099f212f9b30d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-multicap.sty \
texlive-multicap"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
