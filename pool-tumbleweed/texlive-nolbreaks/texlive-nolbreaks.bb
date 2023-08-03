SUMMARY = "No line breaks in text"
DESCRIPTION = "Use \\nolbreaks{some text} to prevent line breaks in 'some \
text'. This has the advantage over \\mbox{} that glue (rubber \
space) remains flexible. Most common cases are handled here \
(\\linebreak is disabled, for example) but spaces hidden in \
macros or { } can still create break-points."
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.2svn26786"

RPM_NAME = "texlive-nolbreaks-2023.209.1.2svn26786-55.1.noarch.rpm"
RPM_HASH = "ba9bcd76b76450344dae710943bd726a8b2f5655c9f0a017f21b0e4305bebc5e22ebdd3257cefee70a3ee05d1b16f0d7eb5b89e1e0e632c410ed07b1999bd97a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-nolbreaks.sty \
texlive-nolbreaks"

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
