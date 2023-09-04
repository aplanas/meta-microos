SUMMARY = "Consolidated environment for displayed text"
DESCRIPTION = "As an alternative to the LaTeX standard environments quotation \
and quote, the package provides a consolidated environment for \
displayed text. First-line indentation may be activated by \
adding a blank line before the quoting environment. A key-value \
interface (using kvoptions) allows the user to configure font \
properties and spacing and to control orphans within and after \
the environment."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1csvn32818"

RPM_NAME = "texlive-quoting-2023.209.0.0.1csvn32818-54.2.noarch.rpm"
RPM_HASH = "a53fa87700760bcc494e522b9133d5fb650cc403872602bb8c12b563a8ea596a979d764f30a2ca5692728edc32aa3fe252afa463cf14320acbb6eab1fcbd68fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-quoting.sty \
texlive-quoting"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
