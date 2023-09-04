SUMMARY = "Critical annotations to footnotes with ednotes"
DESCRIPTION = "The package modifies the annotation commands and label-test \
mechanism of the ednotes package so that critical notes appear \
on the pages and in the order that one would expect."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.6bsvn21540"

RPM_NAME = "texlive-edfnotes-2023.209.0.0.6bsvn21540-54.2.noarch.rpm"
RPM_HASH = "9db5fb817a27bc1bc6f90fee3f3ab733b7237041aa78e4233e8e15068974ed67170b0cf483fca62f479d22cced53238a2aa45d0deb35b7e26b52bee0247f3d0d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-edfnotes.sty \
texlive-edfnotes"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-fnlineno.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
