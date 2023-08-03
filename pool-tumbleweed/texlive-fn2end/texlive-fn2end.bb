SUMMARY = "Convert footnotes to endnotes"
DESCRIPTION = "Defines macros \\makeendnotes, which converts \\footnote to \
produce endnotes; and \\theendnotes which prints them out."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.1svn15878"

RPM_NAME = "texlive-fn2end-2023.209.1.1svn15878-53.1.noarch.rpm"
RPM_HASH = "25f251838d6d812a9fe11f2701b1fa318f78b143b65779d9c7fae1794e1052d1b1bdacd540d7ec9a3c929a3037dc30ff949ccee53cd998e3e22abae5d2bd8ba5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-fn2end.sty \
texlive-fn2end"

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
