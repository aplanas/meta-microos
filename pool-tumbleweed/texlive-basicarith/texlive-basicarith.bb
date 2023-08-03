SUMMARY = "Macros for typesetting basic arithmetic"
DESCRIPTION = "The package provides macros for typesetting basic arithmetic, \
in the style typically found in textbooks. It focuses on the \
American style of performing these algorithms. It is written \
mostly in low-level TeX, with the goal that it should run in \
either plain TeX or LaTeX, but there are two constructions that \
currently prevent this. It is highly configurable, with macros \
and lengths described in the documentation."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn35460"

RPM_NAME = "texlive-basicarith-2023.209.1.1svn35460-54.1.noarch.rpm"
RPM_HASH = "e382a85e72dd326ae7a2e8defc2182b30029a57444b408d96b4035eaf4cf03604a492ff7d4e7e8745a426ac4cb7e15780d062c7c7acc2033d754258e53afaef5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-basicarith.sty \
texlive-basicarith"

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
