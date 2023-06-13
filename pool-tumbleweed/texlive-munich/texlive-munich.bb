SUMMARY = "An alternative authordate bibliography style"
DESCRIPTION = "The Munich BibTeX style is produced with custom-bib, as a \
German (and, more generally, Continental European) alternative \
to such author-date styles as harvard and oxford."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-munich-2023.201.svn15878-54.1.noarch.rpm"
RPM_HASH = "3e565365b3f86b9ce82258ad361a477c81c46e9a9fa1b2fb9bcc2a40525287cd73fc7f9a31be5ddc05353c655e1698b57f172ebd17bad8b7dd1c19d1d2bace41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-munich"

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
