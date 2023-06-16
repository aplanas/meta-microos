SUMMARY = "Change the layout of individual pages and their text"
DESCRIPTION = "The package is an extension of the changepage package to permit \
the user to change the layout of individual pages and their \
texts."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn16094"

RPM_NAME = "texlive-changelayout-2023.201.1.0svn16094-52.1.noarch.rpm"
RPM_HASH = "cb98f383e06f9af8eb4612d001cd6eb8be9186648a89646093d8aa36b16adcb8d2170e8c665fea0c779867a5448238d02cdb5e06bd55fba643008353eaff4edd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-changelayout.sty \
texlive-changelayout"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etextools.sty \
tex-ltxnew.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
