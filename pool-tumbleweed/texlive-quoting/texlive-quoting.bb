SUMMARY = "Consolidated environment for displayed text"
DESCRIPTION = "As an alternative to the LaTeX standard environments quotation \
and quote, the package provides a consolidated environment for \
displayed text. First-line indentation may be activated by \
adding a blank line before the quoting environment. A key-value \
interface (using kvoptions) allows the user to configure font \
properties and spacing and to control orphans within and after \
the environment."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1csvn32818"

RPM_NAME = "texlive-quoting-2023.201.0.0.1csvn32818-53.1.noarch.rpm"
RPM_HASH = "0e8fa0537be65a3ef272ab59884776d39aba32153ce64e9e3c6c9b502dd78ec253341722f7aaa9afcae71750aa51cdadec204b80657b8ad99eaab4179d462cca"
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
