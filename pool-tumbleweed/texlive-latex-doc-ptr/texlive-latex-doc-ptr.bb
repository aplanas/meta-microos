SUMMARY = "A direction-finder for LaTeX resources available online"
DESCRIPTION = "A brief set of recommendations for users who need online \
documentation of LaTeX. The document supports the need for \
documentation of LaTeX itself, in distributions. For example, \
it could be used in the command texdoc latex, in the TeX Live \
distribution."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn57311"

RPM_NAME = "texlive-latex-doc-ptr-2023.201.svn57311-55.1.noarch.rpm"
RPM_HASH = "36ce0708785b1b544b8a200e208a5f409586342957bd4e82dc73514ade9c48fbae2feb634a8bf8f6d6d61e71676637ce1eaa7c1cd6bd697c1bf4638c9c6fd38c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-doc-ptr"

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
