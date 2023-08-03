SUMMARY = "Babel module to support Macedonian Cyrillic"
DESCRIPTION = "The package provides support for Macedonian documents written \
in Cyrillic, in babel."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn39587"

RPM_NAME = "texlive-babel-macedonian-2023.209.svn39587-54.1.noarch.rpm"
RPM_HASH = "c80b4f8bda789556024cceb9e6be8e06b7af2b752cbfddf41c9a1146dbb9a6376fee0a826b8b87299eb13e44806914396f5b20bcf190625e070bce563487f061"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-macedonian.ldf \
texlive-babel-macedonian"

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
