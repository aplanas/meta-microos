SUMMARY = "Macros for typesetting formal linguistics"
DESCRIPTION = "This package contains macros for typesetting glosses and formal \
expressions. It covers a range of subfields in formal \
linguistics."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn42268"

RPM_NAME = "texlive-ling-macros-2023.201.svn42268-54.1.noarch.rpm"
RPM_HASH = "306af1fbfd3851cc306b80e283169ab36143e962b607a28b8dcbe7ab3627f9e799c1bef28a8bdd83bb3345651a77726e819f4fe3c42cb0ecd6b61dd0d4b0b7c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ling-macros.sty \
texlive-ling-macros"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-gb4e.sty \
tex-pbox.sty \
tex-relsize.sty \
tex-stmaryrd.sty \
tex-ulem.sty \
tex-upgreek.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
