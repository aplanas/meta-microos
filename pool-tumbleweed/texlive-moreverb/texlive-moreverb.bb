SUMMARY = "Extended verbatim"
DESCRIPTION = "A collection of verbatim facilities that provide line-numbered \
verbatim, verbatim that obeys TAB characters, verbatim input \
and verbatim output to file. The package makes use of the LaTeX \
required verbatim package. The package is formed from a series \
of small pieces, and is somewhat unstructured. The user who \
looks for thought-through verbatim facilities is advised to \
consider using the fancyvrb package in place of moreverb."
LICENSE = "LPPL-1.0"

PV = "2023.201.2.3asvn22126"

RPM_NAME = "texlive-moreverb-2023.201.2.3asvn22126-54.1.noarch.rpm"
RPM_HASH = "e201cac09f3272cd3917dd1ec66d9f1fa2b3dfe2b51172294859bcf0fb9e318c8774b52bf73c97d2b251f2a3e9db3a17ccedb35dcd066ac569f13c280f463e45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-moreverb.sty \
texlive-moreverb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-verbatim.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
