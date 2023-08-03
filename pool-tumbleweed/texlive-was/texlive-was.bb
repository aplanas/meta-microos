SUMMARY = "A collection of small packages by Walter Schmidt"
DESCRIPTION = "A bundle of packages that arise in the author's area of \
interest: compliance of maths typesetting with ISO standards; \
symbols that work in both maths and text modes commas for both \
decimal separator and maths; and upright Greek letters in \
maths."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn64691"

RPM_NAME = "texlive-was-2023.209.svn64691-54.1.noarch.rpm"
RPM_HASH = "217963ab1d001a170271310c3e49150af31c00001635127eb8c3ccfa09c9f8211ea5b9ea2a4f5a2bd578a239c7c08a809c0c48f8a95e6ca29ae30aa1aec9cc07"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-icomma.sty \
tex-upgreek.sty \
texlive-was"

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
