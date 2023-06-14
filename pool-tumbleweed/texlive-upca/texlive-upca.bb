SUMMARY = "Print UPC-A barcodes"
DESCRIPTION = "The package defines a single macro \\upca, to print UPC-A \
barcodes."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn22511"

RPM_NAME = "texlive-upca-2023.201.svn22511-53.1.noarch.rpm"
RPM_HASH = "88eab4b1ec34ab090ab0c7a8b20f1cf6ce7fed66d71bf665005a740a05f2e57a0c5c64ce01abff1081420b9a0130fd9c15c546a46e6b6d9b4bb8589af2421b45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-upca.tex \
texlive-upca"

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
