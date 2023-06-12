SUMMARY = "Dynamically typeset numbers and values in LaTeX through 'symbolic links'"
DESCRIPTION = "This package dynamically typesets values generated by different \
kinds of scripts in LaTeX through the use of 'symbolic links' \
(which are not in any way related to the 'symbolic links' used \
in UNIX systems!). The aim is to reduce errors resulting from \
out-of-date numbers by directly setting them in the number \
generating file and importing a 'symbolic link' into the LaTeX \
source file. It can be used to import not only numerical \
values, but strings and pieces of code are also possible. \
Currently only MATLAB and Python are supported to produce \
Dynamic Number list files."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1.3svn38726"

RPM_NAME = "texlive-dynamicnumber-2023.201.0.0.1.3svn38726-53.1.noarch.rpm"
RPM_HASH = "87c979715bd37bf615eaef856a4f3a931822ef0f09547df30c213de91dbb3bd38194bad6f9d4b61d4d30289f83a5926069404fbb42e530dbdb63aaf9c3ca40cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(dynamicnumber.sty) \
texlive-dynamicnumber"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(pgfkeys.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm