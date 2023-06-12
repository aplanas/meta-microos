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

PV = "2023.201.svn27388"

RPM_NAME = "texlive-punk-2023.201.svn27388-53.1.noarch.rpm"
RPM_HASH = "0e48d20201af0e0c839b2d50e903e6343669b2a7c684841444311d6cf2bd4bb7372127da7c80300a79516c0f7e01209242ad4714d809d89f80cbcdbf37177d47"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(punk10.tfm) \
tex(punk12.tfm) \
tex(punk20.tfm) \
tex(punkbx20.tfm) \
tex(punksl20.tfm) \
texlive-punk"
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
