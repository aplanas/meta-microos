SUMMARY = "Support for German typography"
DESCRIPTION = "Supports the old German orthography (alte deutsche \
Rechtschreibung)."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.5esvn42428"

RPM_NAME = "texlive-german-2023.209.2.5esvn42428-53.1.noarch.rpm"
RPM_HASH = "e871731178303f5950a11f0659d051f8485207704b5ecf0b5ed808ab57747ac9bd949485de8f94697af19e7124e0612a223d3dc6c1290a57e9d59eb0821bde4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-german.sty \
tex-ngerman.sty \
texlive-german"

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
