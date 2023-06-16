SUMMARY = "Check for errors in LaTeX documents"
DESCRIPTION = "The program reports typographic and other errors in LaTeX \
documents. Filters are also provided for checking the LaTeX \
parts of CWEB documents."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.7.8svn64797"

RPM_NAME = "texlive-chktex-2023.201.1.7.8svn64797-53.1.noarch.rpm"
RPM_HASH = "9e2daefa35e34826824421c47c5cc8035b483d4be37acacb3111f36394fcbe9000fc45752dc5297ddc00683ce047200b6d5798224df0367d117cdca3e4a80872"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chktex"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-chktex-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
