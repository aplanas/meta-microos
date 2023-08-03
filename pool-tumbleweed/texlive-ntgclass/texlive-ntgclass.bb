SUMMARY = "'European' versions of standard classes"
DESCRIPTION = "The bundle offers versions of the standard LaTeX article and \
report classes, rewritten to reflect a more European design, \
and the a4 package, which is better tuned to the shape of a4 \
paper than is the a4paper class option of the standard classes. \
The classes include several for article and report \
requirements, and a letter class. The elements of the bundle \
were designed by members of the Dutch TeX Users Group NTG."
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1fsvn65522"

RPM_NAME = "texlive-ntgclass-2023.209.2.1fsvn65522-55.1.noarch.rpm"
RPM_HASH = "fc1a97dd71c4fd6ed2371b9ffca6b20c23731458c4565e603742639541bd216b7e72e45601fa55f524f2fcd6e9394a8d0ba20acb9b54368db2f4b13e45ca9e93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-a4.sty \
tex-artikel1.cls \
tex-artikel2.cls \
tex-artikel3.cls \
tex-boek.cls \
tex-boek3.cls \
tex-brief.cls \
tex-ntg10.clo \
tex-ntg11.clo \
tex-ntg12.clo \
tex-rapport1.cls \
tex-rapport3.cls \
texlive-ntgclass"

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
