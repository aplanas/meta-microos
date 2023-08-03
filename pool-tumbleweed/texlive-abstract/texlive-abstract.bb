SUMMARY = "Control the typesetting of the abstract environment"
DESCRIPTION = "The abstract package gives you control over the typesetting of \
the abstract environment, and in particular provides for a one \
column abstract in a two column paper."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2asvn15878"

RPM_NAME = "texlive-abstract-2023.209.1.2asvn15878-55.1.noarch.rpm"
RPM_HASH = "c007ea8bf0bde9bb95aaa1a6a7be665a4b81183a4b8147b1827a00f70f0f1706a6de0144f312e238fb5b215deb1b07574fac326e82f84284ae3b2d6e5503ef17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-abstract.sty \
texlive-abstract"

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
