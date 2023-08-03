SUMMARY = "Quickly define several similar macros"
DESCRIPTION = "Multidef provides a simple way of defining several macros \
having similar definitions."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.10svn40637"

RPM_NAME = "texlive-multidef-2023.209.1.10svn40637-55.1.noarch.rpm"
RPM_HASH = "7f2f5ae60b9f39a1e2b3035ecbb040a4fa8e815d10ae0c7124b4656718f2ef122682668214094a13f330ab9add3b6b695e995e1becf597a2bada822ac72398f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-multidef.sty \
texlive-multidef"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-trimspaces.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
