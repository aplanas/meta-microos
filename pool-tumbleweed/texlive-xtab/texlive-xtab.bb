SUMMARY = "Break tables across pages"
DESCRIPTION = "Xtab is an extended and somewhat improved version of \
supertabular; its xtabular environment provides tables that \
break across pages."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3fsvn23347"

RPM_NAME = "texlive-xtab-2023.209.2.3fsvn23347-53.2.noarch.rpm"
RPM_HASH = "70e3ab600ca56821520a5f3c12a072619078a7565155b354db74c523982568a2199d239821f85d36dcf35282a8c52632b0d527e0f1c7e10446a00fc40d8a0464"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xtab.sty \
texlive-xtab"

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
