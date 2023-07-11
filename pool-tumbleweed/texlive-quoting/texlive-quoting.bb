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

RPM_NAME = "texlive-quoting-2023.201.0.0.1csvn32818-53.2.noarch.rpm"
RPM_HASH = "343a8557d36e36fac506b979542ca50f3fcc4d300a44f1a442b19563f5025aa5b192906cdbb05a107cff3e4115571fbfa18d30ff9058f53b5bbdc736ababe2ae"
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
