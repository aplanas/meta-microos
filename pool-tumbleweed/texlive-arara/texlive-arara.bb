SUMMARY = "Automation of LaTeX compilation"
DESCRIPTION = "Arara is comparable with other well-known compilation tools \
like latexmk and rubber. The key difference is that arara \
determines its actions from metadata in the source code, rather \
than relying on indirect resources, such as log file analysis. \
Arara requires a Java virtual machine."
LICENSE = "BSD-3-Clause"

PV = "2023.209.7.0.4svn63760"

RPM_NAME = "texlive-arara-2023.209.7.0.4svn63760-55.1.noarch.rpm"
RPM_HASH = "9a599d2d476530cb82e5f0da8f48255a2e6ff7ca1709322e19b1e620dedd46971904caf72568ed1ce15763051196dbb2245d39939d9213fae7900f783f5ee246"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-arara.jar \
texlive-arara"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
java \
sed \
texlive \
texlive-arara-bin \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
