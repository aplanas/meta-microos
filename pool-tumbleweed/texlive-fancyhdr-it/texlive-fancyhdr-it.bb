SUMMARY = "Italian translation of fancyhdr documentation"
DESCRIPTION = "The translation is of documentation provided with the fancyhdr \
package."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn21912"

RPM_NAME = "texlive-fancyhdr-it-2023.201.svn21912-52.1.noarch.rpm"
RPM_HASH = "fde5a4bd0a9e62fbd7cc5b5d88d40f26303e1b6c62bbddefb8258dd188ca732474e43d321b59fd8a5dfa2beedc26a5385223b19c85703f7b394c7ca09dfb855a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fancyhdr-it"

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
