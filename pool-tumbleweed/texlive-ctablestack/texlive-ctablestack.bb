SUMMARY = "Catcode table stable support"
DESCRIPTION = "This package provides a method for defining category code table \
stacks in LuaTeX. It builds on code provided by the 2015/10/01 \
release of LaTeX2e (also available as ltluatex.sty for plain \
users). It is required by the luatexbase package (v1.0 onward) \
which uses ctablestack to provide a back-compatibility form of \
this concept."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn38514"

RPM_NAME = "texlive-ctablestack-2023.209.1.0svn38514-55.1.noarch.rpm"
RPM_HASH = "04bf016f4ae7015c1b3fc6d5f0323b1d6891032ab21ad3ac096af03f9f61eb8d512e78ed35ecc99a57e77bc3450d7179de413d92e6c5b47e6ed2e6bea71c02d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ctablestack.sty \
texlive-ctablestack"

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
