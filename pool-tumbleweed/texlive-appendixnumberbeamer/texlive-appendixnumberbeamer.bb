SUMMARY = "Manage frame numbering in appendixes in beamer"
DESCRIPTION = "This package fixes the frame numbering in beamer when using an \
appendix such that the slides from the appendix are not counted \
in the total frame number of the main part of the document. The \
total frame number counter is reset to 0 when entering the \
appendix. The standard usage is to include \
\\usepackage{appendixnumberbeamer} in the preamble and then \
declare the beginning of the appendix as usual using the \
\\appendix command."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.2svn46317"

RPM_NAME = "texlive-appendixnumberbeamer-2023.209.1.2svn46317-55.1.noarch.rpm"
RPM_HASH = "90fdd47286953736092762f9d9909ca2977f8948ff1cf6afb9ad7a015b1e3ace037da72f64abc0660a5bff73f31e5f2a7a53244c7b61ba69dd6797fa37f91139"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-appendixnumberbeamer.sty \
texlive-appendixnumberbeamer"

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
