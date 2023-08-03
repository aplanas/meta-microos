SUMMARY = "Count compilations of a document"
DESCRIPTION = "The package counts how often a LaTeX document is compiled, \
keeping the data in an external file. To print the count, can \
use the macro \\thecounttexruns."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.00asvn27576"

RPM_NAME = "texlive-counttexruns-2023.209.1.00asvn27576-55.1.noarch.rpm"
RPM_HASH = "9816d81aeff979e279a46b151a64bef3d081be2ffdd04799e514623044c3f37aa74d12d11d5cd66c03cfe1ce5c3782a001480755342e4f342bc18f4ff5a1a35e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-counttexruns.sty \
texlive-counttexruns"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
