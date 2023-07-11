SUMMARY = "Establish input relative to a directory"
DESCRIPTION = "The commands \\import{full_path}{file} and \
\\subimport{path_extension}{file} set up input through standard \
LaTeX mechanisms (\\input, \\include and \\includegraphics) to \
load files relative to the \\import-ed directory. There are also \
\\includefrom, \\subincludefrom, and * variants of the commands."
LICENSE = "SUSE-Public-Domain"

PV = "2023.208.6.2svn54683"

RPM_NAME = "texlive-import-2023.208.6.2svn54683-53.1.noarch.rpm"
RPM_HASH = "5cec33f89b9758b651ddea87ace42b9d4513bdcb7fa992091e91da102de9643ee8e89b32f9f1173f3b52f032c11f92457bad4b334b4f7d1dbbdbd6a115c92079"
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
