SUMMARY = "Simple macros supporting abreviations for Plain and LaTeX"
DESCRIPTION = "The package provides some simple macros to support \
abbreviations in Plain TeX or LaTeX. It allows writing (e.g.) \
\\<TEX> instead of \\TeX, hence frees users from having to escape \
space after parameterless macros."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-abbr-2023.209.svn15878-55.1.noarch.rpm"
RPM_HASH = "7d85e3bcc64f220ec032b649c218c3e6073ffa508248aba45eaef5757b98ab82474d352bd19acc8815cd79502e4808f5cc2ed25f999c909c1bbdc46fa3d51767"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-abbr.tex \
texlive-abbr"

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
