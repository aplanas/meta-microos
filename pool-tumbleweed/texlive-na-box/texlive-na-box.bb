SUMMARY = "Arabic-aware version of pas-cours package"
DESCRIPTION = "This is a modified version of the pas-cours package made \
compatible with XeLaTeX/polyglossia to write arabic documents \
with fancy boxed theorem-alike environments."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn45130"

RPM_NAME = "texlive-na-box-2023.209.1.0svn45130-55.1.noarch.rpm"
RPM_HASH = "2556c3a49456b050656aed0a7115b69e59b4bfe9ed418f6afddc2c2bc7fd9baa60ec9e7c78ad7b2618c06f52df25d15700cfa85ef956383ea48bd68c899b5dd2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-na-box.sty \
texlive-na-box"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amssymb.sty \
tex-enumitem.sty \
tex-tikz.sty \
tex-xkeyval.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
