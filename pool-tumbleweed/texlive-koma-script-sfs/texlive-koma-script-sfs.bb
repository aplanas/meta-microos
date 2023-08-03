SUMMARY = "Koma-script letter class option for Finnish"
DESCRIPTION = "A koma-script parameter set for letters on A4 paper, complying \
with Finnish standards SFS 2486, 2487 and 2488; suitable for \
window envelopes with window on the left size in the sizes C5, \
C65, E5 and E65 (although, because the address window is \
smaller, for sizes E5 and E65 the address may not fit within \
the window, but ordinary 3-line address should fit)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn26137"

RPM_NAME = "texlive-koma-script-sfs-2023.209.1.0svn26137-56.1.noarch.rpm"
RPM_HASH = "f34f9fd77a0c95db344b8c19a77b6411698f76c7b420ec907dfe0b754d06e09b6306a26cd14c5961934090acc68bc8d22b38603ee49a4a4dadcadf81b00e8f87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-koma-script-sfs"

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
