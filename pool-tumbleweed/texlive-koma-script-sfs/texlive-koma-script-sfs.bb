SUMMARY = "Koma-script letter class option for Finnish"
DESCRIPTION = "A koma-script parameter set for letters on A4 paper, complying \
with Finnish standards SFS 2486, 2487 and 2488; suitable for \
window envelopes with window on the left size in the sizes C5, \
C65, E5 and E65 (although, because the address window is \
smaller, for sizes E5 and E65 the address may not fit within \
the window, but ordinary 3-line address should fit)."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn26137"

RPM_NAME = "texlive-koma-script-sfs-2023.201.1.0svn26137-55.1.noarch.rpm"
RPM_HASH = "45583eb2bef873cc69bd9c541422d656585500cc954ae1820e692c9c257cf2f5d8e7a5ad80999d7930f65551ffc29bb8bd68167ab337cf8827262c3ddee1e659"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-koma-script-sfs"

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
