SUMMARY = "Critical annotations to footnotes with ednotes"
DESCRIPTION = "The package modifies the annotation commands and label-test \
mechanism of the ednotes package so that critical notes appear \
on the pages and in the order that one would expect."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.6bsvn21540"

RPM_NAME = "texlive-edfnotes-2023.209.0.0.6bsvn21540-54.1.noarch.rpm"
RPM_HASH = "47b6c5654ae5263a84bcc7559b5416c8ade9b0480d6b8ec0ad28a88bb5062eca64ee9f01bc4aad6a5b9a563f5b2074c634dabfc26fb218d2b942b7ee4e0db736"
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
