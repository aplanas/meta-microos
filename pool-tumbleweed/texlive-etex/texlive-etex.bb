SUMMARY = "An extended version of TeX, from the NTS project"
DESCRIPTION = "An extended version of TeX (which is capable of running as if \
it were TeX unmodified). E-TeX has been specified by the LaTeX \
team as the engine for the development of LaTeX2e, in the \
immediate future; as a result, LaTeX programmers may (in all \
current TeX distributions) assume e-TeX functionality. The \
pdftex engine directly incorporates the e-TeX extensions. The \
development source for e-TeX is the TeX Live source repository."
LICENSE = "SUSE-TeX"

PV = "2023.201.svn66203"

RPM_NAME = "texlive-etex-2023.201.svn66203-52.1.noarch.rpm"
RPM_HASH = "9b5a02c6ee809120b23edee66a633271047f7be254ecfbaa20aa99d112a85691612155cdafdbe03e6303f76c1dba49f69e2c4040998efd977d0cb85bc6c5dfac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(xbmc10.tfm) \
texlive-etex"

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
