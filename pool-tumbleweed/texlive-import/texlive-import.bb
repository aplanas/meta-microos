SUMMARY = "Establish input relative to a directory"
DESCRIPTION = "The commands \\import{full_path}{file} and \
\\subimport{path_extension}{file} set up input through standard \
LaTeX mechanisms (\\input, \\include and \\includegraphics) to \
load files relative to the \\import-ed directory. There are also \
\\includefrom, \\subincludefrom, and * variants of the commands."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.6.2svn54683"

RPM_NAME = "texlive-import-2023.201.6.2svn54683-52.1.noarch.rpm"
RPM_HASH = "3aaf3b74235684128a882b2b2656d6e15a431baa63d508e8b782e97790f23326b6e23f1bba2472b8cddc804614d446a93ccfead1a15f03535d10b6d16fa661ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-import.sty \
texlive-import"

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
