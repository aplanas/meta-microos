SUMMARY = "Allow verbatim, etc., in macro arguments"
DESCRIPTION = "The package defines the macro \\cprotect that makes a following \
macro proof against verbatim in its argument; as, for example, \
\\cprotect\\section{\\verb'foo'} A similar macro \\cprotEnv \
(applied to the \\begin of an environment) sanitises the \
behavior of fragile environments. Moving arguments, and \
corresponding 'tables of ...' work happily."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0esvn21209"

RPM_NAME = "texlive-cprotect-2023.209.1.0esvn21209-55.1.noarch.rpm"
RPM_HASH = "58fc065bb62d82350d0dbe6f1a6c82e699f9ff125dfb291c7462646d019e793bbe7916e0d02b128a5bc422067a8077c7c657e5862d6c0bbf4841c83014cc9de0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cprotect.sty \
texlive-cprotect"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifthen.sty \
tex-suffix.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
