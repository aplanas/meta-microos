SUMMARY = "Templates for TeX usage"
DESCRIPTION = "A set of templates for using LaTeX packages that the author \
uses, comprising: - Hausarbeit.tex: for students of the \
Lehrstuhl Volkskunde an der Friedrich-Schiller-Universitat \
Jena; - Psycho-Dipl.tex: for diploma theses in psychology."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-templates-sommer-2023.201.svn15878-54.1.noarch.rpm"
RPM_HASH = "46ed2bb40026e6ae83ed5cfc4296689693ac17b6e6e82f94a878b2ef3c4a87f4e6272fa515db0f45a04803c066389c2e94d48c9de9b80ea9d5afd916eff111a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-templates-sommer"

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
