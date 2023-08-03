SUMMARY = "A letter class option file for the automatic creation of copies"
DESCRIPTION = "The file copy.lco provides the new class option 'copy' for the \
KOMA-Script letter class scrlttr2. If the option 'copy' is \
given, all pages of a specific letter are duplicated with \
background text marking as copies."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3asvn56733"

RPM_NAME = "texlive-scrlttr2copy-2023.209.0.0.3asvn56733-54.1.noarch.rpm"
RPM_HASH = "41b0cc3231686ccc14a2b3f8448f87b951c352ddb99779ada220af9735890ab5e9801265ba737be59e3f05e1ddbe6f57a1be14109f4a2d137f8cb2e7dfd0a324"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scrlttr2copy"

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
