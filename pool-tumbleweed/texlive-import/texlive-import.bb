SUMMARY = "Establish input relative to a directory"
DESCRIPTION = "The commands \\import{full_path}{file} and \
\\subimport{path_extension}{file} set up input through standard \
LaTeX mechanisms (\\input, \\include and \\includegraphics) to \
load files relative to the \\import-ed directory. There are also \
\\includefrom, \\subincludefrom, and * variants of the commands."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.6.2svn54683"

RPM_NAME = "texlive-import-2023.209.6.2svn54683-54.1.noarch.rpm"
RPM_HASH = "4edb43af70f64fec65678d07ac59aecc9b6b4d9b1f32134ab2ee72d05e4ca094a4fcd2d81eb28b39f9d65b8cb3b8bd4fc56adec327834c3b1aed58b8205fdc5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-import.sty \
texlive-import"

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
