SUMMARY = "'European' versions of standard classes"
DESCRIPTION = "The bundle offers versions of the standard LaTeX article and \
report classes, rewritten to reflect a more European design, \
and the a4 package, which is better tuned to the shape of a4 \
paper than is the a4paper class option of the standard classes. \
The classes include several for article and report \
requirements, and a letter class. The elements of the bundle \
were designed by members of the Dutch TeX Users Group NTG."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1fsvn65522"

RPM_NAME = "texlive-ntgclass-2023.201.2.1fsvn65522-54.1.noarch.rpm"
RPM_HASH = "330b0e5ef9b78ead50cd3eef5f0bab01d993aff28c8501d03e71391efaf3902e67e63bca182b69abae6bd934314416bf1a17a5cf10f8df671a0f0b7dd4e5e3f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(a4.sty) \
tex(artikel1.cls) \
tex(artikel2.cls) \
tex(artikel3.cls) \
tex(boek.cls) \
tex(boek3.cls) \
tex(brief.cls) \
tex(ntg10.clo) \
tex(ntg11.clo) \
tex(ntg12.clo) \
tex(rapport1.cls) \
tex(rapport3.cls) \
texlive-ntgclass"
RDEPENDS:${PN} += "/bin/sh \
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
