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

PV = "2023.209.0.0.1.3svn38726"

RPM_NAME = "texlive-dynamicnumber-2023.209.0.0.1.3svn38726-54.1.noarch.rpm"
RPM_HASH = "772254273016064e04e514af702fe4768195d076a3b7b2b7a5a9a9d4dd22c33feec525a6da7c6acb8c7e4e02ad4638793b8ca5de6d56435163256fd810482709"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dynamicnumber.sty \
texlive-dynamicnumber"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-pgfkeys.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
