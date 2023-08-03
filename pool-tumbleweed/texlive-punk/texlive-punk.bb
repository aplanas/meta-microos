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

RPM_NAME = "texlive-punk-2023.209.svn27388-54.1.noarch.rpm"
RPM_HASH = "64c4145b6c8f6bf7ca1b8b4ab0642b1267b028b80733ee067475c8e4789567ff9a5a3360634c644d036dada9a23a1ef74105fce5f094cbfeb5a5b97a5212b8ab"
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
