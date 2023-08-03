SUMMARY = "A TeX format for physics papers"
DESCRIPTION = "PSIZZL is a TeX format for physics papers written at SLAC and \
used at several other places. It dates from rather early in the \
development of TeX82; as a result, some of the descriptions of \
limitations look rather quaint to modern eyes."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.35svn15878"

RPM_NAME = "texlive-psizzl-2023.209.0.0.35svn15878-53.1.noarch.rpm"
RPM_HASH = "c9759df46aa9204adbf5987d976f1e997e8aff84d9ec1d16bf298e40f99ac53ff591fd3bd89aa1f66eedf0138cc99fceb0f6ebb29ab14aeaf991d9ca531ad96f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-mypsizzl.tex \
tex-psizzl.tex \
texlive-psizzl"

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
