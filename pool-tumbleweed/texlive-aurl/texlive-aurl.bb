SUMMARY = "Extends the hyperref package with a mechanism for hyperlinked URLs abbreviated with prefixes"
DESCRIPTION = "Semantic Web resource URLs are often abbreviated with prefixes, \
like 'owl:Class' or 'rdf:type'. The abbreviated URL (aurl) \
package provides the correct hyperlinks for those URLs. The \
1000 most common prefixes are predefined and more can be added."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn41853"

RPM_NAME = "texlive-aurl-2023.201.svn41853-53.1.noarch.rpm"
RPM_HASH = "35ac003cbf9aa2bc0015345bc94cac2a71385eb98498e9e55a71bb445e8067ee4e7fc8d819b85e0b280ae39d5ff3dd3538d51889963ee0f00d40c6c309f73be1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(aurl.sty) \
texlive-aurl"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(hyperref.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
