SUMMARY = "Updated date typesetting for Serbian"
DESCRIPTION = "Babel defines dates for Serbian texts, in Latin script. The \
style it uses does not match current practices. The present \
package defines a \\date command that solves the problem."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn23446"

RPM_NAME = "texlive-serbian-date-lat-2023.209.svn23446-54.1.noarch.rpm"
RPM_HASH = "8231449b681375a3e2dfba8840c53414766e28b28fb4f460340e4ebe6db09769fae0fcd4e505cb7a1e7485293295924f8f31f4ffc7bf13f3180ae6ccce3541b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-serbian-date-lat.sty \
texlive-serbian-date-lat"

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
