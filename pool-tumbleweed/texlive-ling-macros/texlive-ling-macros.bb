SUMMARY = "Macros for typesetting formal linguistics"
DESCRIPTION = "This package contains macros for typesetting glosses and formal \
expressions. It covers a range of subfields in formal \
linguistics."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn42268"

RPM_NAME = "texlive-ling-macros-2023.209.svn42268-55.1.noarch.rpm"
RPM_HASH = "b4799e63a5135e20781994b6ca83f46b709cffe2001463873b8e7b5544396d637342b6c816e52f5353929d3456cf5924047cbcf1d3a1f9b106d6280b0e9b2e3d"
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
