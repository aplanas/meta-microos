SUMMARY = "Allow verbatim, etc., in macro arguments"
DESCRIPTION = "The package defines the macro \\cprotect that makes a following \
macro proof against verbatim in its argument; as, for example, \
\\cprotect\\section{\\verb'foo'} A similar macro \\cprotEnv \
(applied to the \\begin of an environment) sanitises the \
behavior of fragile environments. Moving arguments, and \
corresponding 'tables of ...' work happily."
LICENSE = "LPPL-1.0"

PV = "2023.204.1.0esvn21209"

RPM_NAME = "texlive-cprotect-2023.204.1.0esvn21209-54.1.noarch.rpm"
RPM_HASH = "2b4d57277924279dc7e4a1b97e5bd1449ab21d185ab84d4511d97d6605c6f7084d0bee0a032ad5e5d972fb672fe66edf7141fce88cb8cf3dc7e99503843a585f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(cprotect.sty) \
texlive-cprotect"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(ifthen.sty) \
tex(suffix.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
