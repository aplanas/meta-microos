SUMMARY = "Utility programs for use with TeX"
DESCRIPTION = "Basic utitility programs, comprising: dvitype, which converts a \
TeX output (DVI) file to a plain text file (see also the DVI \
Text Language suite); pooltype, which converts a TeX-suite \
program's 'pool' (string) file into human-readable form; and \
tftopl and pltotf, which convert TeX Font Metric (TFM) file to \
human readable Property List (PL) files and vice versa."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn66186"

RPM_NAME = "texlive-texware-2023.209.svn66186-55.1.noarch.rpm"
RPM_HASH = "5d2d9f4f4876144dcab34415d3706a1d85aebd894fa6980a896c4e248154f4753803c0210febc3bb05bb183d77b7f127e5d68ca00f954f932a8a3e564ecb1a74"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-dvitype.1 \
man-pooltype.1 \
texlive-texware"

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
texlive-scripts-bin \
texlive-texware-bin"

inherit rpm
