SUMMARY = "Bibliographic style file for Biomedical Journals"
DESCRIPTION = "This BibTeX style file is generated with the docstrip utility \
and modified manually to meet the Uniform Requirements for \
Manuscripts Submitted to Biomedical Journals as published in N \
Engl J Med 1997;336:309-315 (also known as the Vancouver \
style). The complete set of requirements may be viewed on the \
ICMJE web site."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn59192"

RPM_NAME = "texlive-vancouver-2023.201.1.0svn59192-53.1.noarch.rpm"
RPM_HASH = "6d11c71426f3a413906663df689dcf4bfb07b5215d0428a49a5b3a68d2c4f863b6e838abb5b2d29a2094c4370b866468ca26ee8154450cb195d74140ecd99335"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-vancouver"

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
