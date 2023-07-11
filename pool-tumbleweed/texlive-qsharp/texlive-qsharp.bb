SUMMARY = "Syntax highlighting for the Q# language"
DESCRIPTION = "The package provides syntax highlighting for the Q# language, a \
domain-specific language for quantum programming."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3.1901.1401svn49722"

RPM_NAME = "texlive-qsharp-2023.201.0.0.3.1901.1401svn49722-53.2.noarch.rpm"
RPM_HASH = "04dc85ee772cce4fa9619b15c9c1d94eec5abc925ddea7db58f63b149d872bc637c39aaef810a5a8c25ac02bff2e2f7476b6d6cbf3c5b66708dae64ac77e92fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-qsharp.sty \
texlive-qsharp"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-listings.sty \
tex-xcolor.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
