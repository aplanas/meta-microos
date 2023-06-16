SUMMARY = "A simple accounting package"
DESCRIPTION = "The package deals with 'accounts' of its own specification."
LICENSE = "SUSE-Public-Domain"

PV = "2023.204.svn47085"

RPM_NAME = "texlive-context-account-2023.204.svn47085-54.1.noarch.rpm"
RPM_HASH = "e81a99c1f750ca5962b4babf153b2fcfb48fcc05c578cfe040552befa5fad85eab7ea40f28578e25522c81578cb1837afa52ac68885dacde9c5247f81d038f7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-t-account.tex \
tex-t-floatnumber.tex \
texlive-context-account"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-context \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
