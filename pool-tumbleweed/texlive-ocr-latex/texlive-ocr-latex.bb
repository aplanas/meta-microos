SUMMARY = "LaTeX support for ocr fonts"
DESCRIPTION = "The package supports use of both ocr-a and ocr-b fonts in LaTeX \
documents."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-ocr-latex-2023.201.svn15878-54.1.noarch.rpm"
RPM_HASH = "531d9009aff613ba10d3790ae65366a0f5472e9af05e8dd8e5386df05e97151ad861279b756b3eb67f3fee1bbb188389244bf239cd3578dd7d0fa194467656b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ocr.sty \
tex-ot1oca.fd \
tex-ot1ocra.fd \
tex-ot1ocrb.fd \
tex-ot1ocrbn.fd \
tex-ot1ocrbns.fd \
tex-ot1ocrbo.fd \
tex-ot1ocrbs.fd \
texlive-ocr-latex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
