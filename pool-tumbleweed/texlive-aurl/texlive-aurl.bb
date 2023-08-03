SUMMARY = "Extends the hyperref package with a mechanism for hyperlinked URLs abbreviated with prefixes"
DESCRIPTION = "Semantic Web resource URLs are often abbreviated with prefixes, \
like 'owl:Class' or 'rdf:type'. The abbreviated URL (aurl) \
package provides the correct hyperlinks for those URLs. The \
1000 most common prefixes are predefined and more can be added."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn41853"

RPM_NAME = "texlive-aurl-2023.209.svn41853-54.1.noarch.rpm"
RPM_HASH = "0636c3118682a5006c908df280258adf799177b5b584181e2fce8b1b45c5791ed537d82a1303fa2582ffdc85e1fa0071df033604a270f6cf28df9621ae179ad5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-aurl.sty \
texlive-aurl"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-hyperref.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
