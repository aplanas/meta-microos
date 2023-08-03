SUMMARY = "An alternative authordate bibliography style"
DESCRIPTION = "The Munich BibTeX style is produced with custom-bib, as a \
German (and, more generally, Continental European) alternative \
to such author-date styles as harvard and oxford."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-munich-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "32e51034369f7e273d58c01c53747ae83c3142704c3690ce8ae29debb40d6e3d0ebe9d6f8bee19331ee79cc80a98bc5ea232ea280fa24c32f027e634f1fecb83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-munich"

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
