SUMMARY = "LaTeX support for ocr fonts"
DESCRIPTION = "The package supports use of both ocr-a and ocr-b fonts in LaTeX \
documents."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-ocr-latex-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "35ddc43eec724adc7dfa5b61df6f55edd59d313e745cbc806ceb9bb7605e68501b6cc9a7e55c466f0ba6d62daa6371f1d3cccb33c6202d71f6b790991fc7b82b"
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
