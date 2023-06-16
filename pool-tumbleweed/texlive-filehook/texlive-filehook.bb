SUMMARY = "Hooks for input files"
DESCRIPTION = "The package provides several file hooks (AtBegin, AtEnd, ...) \
for files read by \\input, \\include and \\InputIfFileExists. \
General hooks for all such files (e.g. all \\included ones) and \
file specific hooks only used for named files are provided; two \
hooks are provided for the end of \\included files -- one \
before, and one after the final \\clearpage."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.8bsvn64822"

RPM_NAME = "texlive-filehook-2023.201.0.0.8bsvn64822-52.1.noarch.rpm"
RPM_HASH = "deb0a9b1ba6f3f66667941015c0d1bbeaa8de343ab8e7b254b72477151fceeb33bb92f00d3b47d62162096fe5b3c2ce5cc6a2f4550ef440b5be78f01aa031a2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-filehook-2019.sty \
tex-filehook-2020.sty \
tex-filehook-fink.sty \
tex-filehook-listings.sty \
tex-filehook-memoir.sty \
tex-filehook-scrlfile.sty \
tex-filehook.sty \
tex-pgf-filehook.sty \
texlive-filehook"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-currfile.sty \
tex-kvoptions.sty \
tex-pgfkeys.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
