SUMMARY = "Associate counters, making them step when a master steps"
DESCRIPTION = "The package provides the means of declaring a set of counters \
to be stepped, each time some 'master' counter is stepped."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.8svn38497"

RPM_NAME = "texlive-assoccnt-2023.209.0.0.8svn38497-54.1.noarch.rpm"
RPM_HASH = "7c27d6ca716ad1d9b36a730b17155e0efa742811b8e931692149322d205a925ba6e29e6c2f11cb47fb7f2e8818ae0643c53955d55b1ddc69adca9217cda680f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-assoccnt.sty \
texlive-assoccnt"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-etoolbox.sty \
tex-xcolor.sty \
tex-xkeyval.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
