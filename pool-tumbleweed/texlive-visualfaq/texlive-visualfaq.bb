SUMMARY = "A Visual LaTeX FAQ"
DESCRIPTION = "Having trouble finding the answer to a LaTeX question? The \
Visual LaTeX FAQ is an innovative new search interface that \
presents over a hundred typeset samples of frequently requested \
document formatting. Simply click on a hyperlinked piece of \
text and the Visual LaTeX FAQ will send your Web browser to the \
appropriate page in the TeX FAQ."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn61719"

RPM_NAME = "texlive-visualfaq-2023.209.svn61719-54.1.noarch.rpm"
RPM_HASH = "542fc71283c0e79dc564cb457fe74b78a7324d5811bfc7bd7a5dccbf5f53d7ddb4f44cf16726c4a67ad6b5c10cdabcaecf76d23f11fd333c894b4bc26b254b2a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-visualfaq"

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
texlive-scripts-bin"

inherit rpm
