SUMMARY = "Alter the position of affiliations in amsart"
DESCRIPTION = "The package is to be used with the amsart documentclass. It \
lets you move the authors' affiliations either just below the \
authors' names on the front page or as footnotes on the first \
page. The email addresses are always listed as a footnote on \
the front page."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn64357"

RPM_NAME = "texlive-amsaddr-2023.209.1.2svn64357-55.1.noarch.rpm"
RPM_HASH = "4052e2c4e97f25c646e6de28ff7149542eccc4195460b0cbeff3e4bd8a3cb55057a6aa975435ef3eef4b69ca3c1c4006ccecc054672071c1b4c6a50f62184ee5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-amsaddr.sty \
texlive-amsaddr"

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
