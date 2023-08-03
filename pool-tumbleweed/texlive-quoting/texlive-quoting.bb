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

RPM_NAME = "texlive-quoting-2023.209.0.0.1csvn32818-54.1.noarch.rpm"
RPM_HASH = "b1c4911f35fdf7b4664453e7b670e1b2a6c7a886bfa2ba2eb557cb6a7aac13b9dc110c35deb0d1cb9e90b08a16efe973a5b90053e2bca471ea2880d249f85403"
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
