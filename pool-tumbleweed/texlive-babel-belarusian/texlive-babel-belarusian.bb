SUMMARY = "Babel support for Belarusian"
DESCRIPTION = "The package provides support for use of Babel in documents \
written in Belarusian."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn49022"

RPM_NAME = "texlive-babel-belarusian-2023.209.1.5svn49022-54.1.noarch.rpm"
RPM_HASH = "4cd74489b75c0210c69bb4f05b0d52f624a6832a96a0b516b931addff95c35b2a77a0ed329594b32b8ee18c5068e1ddc7ea39a16a950a9997213f591ca924cb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-belarusian.ldf \
texlive-babel-belarusian"

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
