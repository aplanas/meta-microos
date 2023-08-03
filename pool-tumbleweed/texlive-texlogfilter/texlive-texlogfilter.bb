SUMMARY = "Filter LaTeX engines output or log file"
DESCRIPTION = "texlogfilter is a Perl script designed to filter LaTeX engines \
output or log file (LaTeX, pdfLaTeX, LuaLaTeX or XeLaTeX). It \
reduces the LaTeX output or log to keep only warnings and \
errors. The result is colorised. Options allow to mask specific \
warnings, such as box or references/citations warnings. It's \
also possible to add custom filter patterns."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn62792"

RPM_NAME = "texlive-texlogfilter-2023.209.1.1svn62792-55.1.noarch.rpm"
RPM_HASH = "4941ec7dfb5d69de832aad1872608f6533b3296447fb010ae00d1d9cb285c5b3c2500c28016437c2704d25404eeb1ca30ccd3436e4dcc0bae60be7ca15cca669"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texlogfilter"

RDEPENDS:${PN} += "/usr/bin/perl \
/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
perl-Getopt--Long \
perl-Term--ANSIColor \
perl-strict \
perl-warnings \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin \
texlive-texlogfilter-bin"

inherit rpm
