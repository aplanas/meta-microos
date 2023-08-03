SUMMARY = "A direction-finder for LaTeX resources available online"
DESCRIPTION = "A brief set of recommendations for users who need online \
documentation of LaTeX. The document supports the need for \
documentation of LaTeX itself, in distributions. For example, \
it could be used in the command texdoc latex, in the TeX Live \
distribution."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn57311"

RPM_NAME = "texlive-latex-doc-ptr-2023.209.svn57311-56.1.noarch.rpm"
RPM_HASH = "b2de06c3141bd4ed75ddcba0b98cc3904033699cfaa856ce9b1bfdec3005639ac13d03aa20c3193ad82a4de12de3e9aa56725b5206cabda689a77ead9d2e9979"
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
