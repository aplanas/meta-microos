SUMMARY = "Syntax highlighting for the Q# language"
DESCRIPTION = "The package provides syntax highlighting for the Q# language, a \
domain-specific language for quantum programming."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3.1901.1401svn49722"

RPM_NAME = "texlive-qsharp-2023.209.0.0.3.1901.1401svn49722-54.1.noarch.rpm"
RPM_HASH = "62d2812ad3ebf96c87fc5f5d4a5b19d8a985bf615dac3835a665db0a560a748dec2c4e628f50da19454fe608a93591800aa2ea130539ee899c08636fe328e348"
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
