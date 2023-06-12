SUMMARY = "Simple macros supporting abreviations for Plain and LaTeX"
DESCRIPTION = "The package provides some simple macros to support \
abbreviations in Plain TeX or LaTeX. It allows writing (e.g.) \
\\<TEX> instead of \\TeX, hence frees users from having to escape \
space after parameterless macros."
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-abbr-2023.201.svn15878-54.1.noarch.rpm"
RPM_HASH = "0312a2696942e1cdf2ff7e456aa3df099679de1bb2859040973625fa85cb4413095099bcc0483def291c35e612bb981fcd26f9df51a5ee659fd00543281e9021"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(abbr.tex) \
texlive-abbr"
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
