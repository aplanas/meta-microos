SUMMARY = "Babel support for Italian text"
DESCRIPTION = "The package provides language definitions for use in babel."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4.07svn62890"

RPM_NAME = "texlive-babel-italian-2023.201.1.4.07svn62890-53.1.noarch.rpm"
RPM_HASH = "7f3f381167148e143fe33f5a829203a368763a1ffef40ad4f2fdb8ec6d3c4a15f3d1cab2af63ca11feb875ff43ed6ad48d5d83a26e94502fde146d37b84d6608"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-italian.ldf \
texlive-babel-italian"

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
