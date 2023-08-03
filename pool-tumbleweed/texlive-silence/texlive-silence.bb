SUMMARY = "Selective filtering of error messages and warnings"
DESCRIPTION = "The package allows the user to filter out unwanted warnings and \
error messages issued by LaTeX, packages and classes, so they \
won't pop out when there's nothing one can do about them. \
Filtering goes from the very broad ('avoid all messages by such \
and such') to the fine-grained ('avoid messages that begin \
with...'). Messages may be saved to an external file for later \
reference."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5bsvn27028"

RPM_NAME = "texlive-silence-2023.209.1.5bsvn27028-54.1.noarch.rpm"
RPM_HASH = "7fd96fb657627fd52b30db004d7e77cd17ca22034a3c726241a1e56513a673b657b1d46d556619abce8e54c381676746729d39b5a63085e639f99f476d365374"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-silence.sty \
texlive-silence"

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
