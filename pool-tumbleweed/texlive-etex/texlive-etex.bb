SUMMARY = "An extended version of TeX, from the NTS project"
DESCRIPTION = "An extended version of TeX (which is capable of running as if \
it were TeX unmodified). E-TeX has been specified by the LaTeX \
team as the engine for the development of LaTeX2e, in the \
immediate future; as a result, LaTeX programmers may (in all \
current TeX distributions) assume e-TeX functionality. The \
pdftex engine directly incorporates the e-TeX extensions. The \
development source for e-TeX is the TeX Live source repository."
LICENSE = "SUSE-TeX"

PV = "2023.209.svn66203"

RPM_NAME = "texlive-etex-2023.209.svn66203-53.1.noarch.rpm"
RPM_HASH = "6b20cf4a80fe15c2ecfc46fb9afa844e11a157c6f512e15e8492488c3eed560ea79aedf7687023943228277c3daa67102c499225544c1e2a0ebf00bb31936a96"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-xbmc10.tfm \
texlive-etex"

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
