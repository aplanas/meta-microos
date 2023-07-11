SUMMARY = "Expandable macros that take an optional argument"
DESCRIPTION = "Commands that take an optional argument are not ordinarily \
expandable; this package allows such commands to be expandable \
provided that they have at least one mandatory argument."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn15878"

RPM_NAME = "texlive-xoptarg-2023.201.1.0svn15878-52.2.noarch.rpm"
RPM_HASH = "c8f0d7381cc46da40333d7b5dd97c692eeaab7de80150e7c8a204d7e08426b2dcfe9428466f69c3b9d5f7f07c55057d0bb5ab121bddf595fbbfb9f1b96d597bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xoptarg.sty \
texlive-xoptarg"

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
