SUMMARY = "Hooks for input files"
DESCRIPTION = "The package provides several file hooks (AtBegin, AtEnd, ...) \
for files read by \\input, \\include and \\InputIfFileExists. \
General hooks for all such files (e.g. all \\included ones) and \
file specific hooks only used for named files are provided; two \
hooks are provided for the end of \\included files -- one \
before, and one after the final \\clearpage."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.8bsvn64822"

RPM_NAME = "texlive-filehook-2023.209.0.0.8bsvn64822-53.1.noarch.rpm"
RPM_HASH = "0cd616a75087f8c0726cfe104f82731b410b69979dbd96a85812f530714fd28b7f3c5fb0d0f54594b7a0f4c53d0d81aafefeb322849ffea13292f36904f970ee"
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
