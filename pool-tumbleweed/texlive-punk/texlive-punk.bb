SUMMARY = "Donald Knuth's punk font"
DESCRIPTION = "A response to the assertion in a lecture that 'typography tends \
to lag behind other stylistic changes by about 10 years'. Knuth \
felt it was (in 1988) time to design a replacement for his \
designs of the 1970s, and came up with this font! The fonts are \
distributed as Metafont source. The package offers LaTeX \
support by Rohit Grover, from an original by Sebastian Rahtz, \
which is slightly odd in claiming that the fonts are \
T1-encoded. A (possibly) more rational support package is to be \
found in punk-latex"
LICENSE = "SUSE-TeX"

PV = "2023.209.svn27388"

RPM_NAME = "texlive-punk-2023.209.svn27388-54.2.noarch.rpm"
RPM_HASH = "7fcf8be61b1196d3ee901b829dac2521eceb83647cb56022653a9b306117d522f4ce270411ba5fa979de8ebc804dc55cf5d33448728b249f97b4a73ae4497e7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-punk10.tfm \
tex-punk12.tfm \
tex-punk20.tfm \
tex-punkbx20.tfm \
tex-punksl20.tfm \
texlive-punk"

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
