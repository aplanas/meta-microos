SUMMARY = "Define textual variants"
DESCRIPTION = "The package provides commands to formalize textual variants in \
critical editions typeset using eledmac."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1asvn38114"

RPM_NAME = "texlive-eledform-2023.209.1.1asvn38114-54.1.noarch.rpm"
RPM_HASH = "56b30c79ce784ca136e3a33696907c7c9f787c97744bd382b2117867dea1258c09a22b33a943d75cf0991038d864fe68a98961e6cc22b19e94733a7a00b848ea"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-eledform.sty \
texlive-eledform"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-eledmac.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
