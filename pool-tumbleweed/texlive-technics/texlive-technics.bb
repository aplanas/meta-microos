SUMMARY = "A package to format technical documents"
DESCRIPTION = "The package provides a very simple LaTeX document template, in \
the hope that this use of LaTeX will become attractive to \
typical word processor users. (Presentation is as if it were a \
class; users are expected to start from a template document.)"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn29349"

RPM_NAME = "texlive-technics-2023.201.1.0svn29349-54.1.noarch.rpm"
RPM_HASH = "7c1b20c2c3cb9b065c8e61f58dfe32a2c3b4e2e3327cc761ac80ab3757e10b401324ec16f1d5597e42f9ff67fd1f5f03d1f23f128a1703cf0a08fef1b56b5d89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(technics.sty) \
texlive-technics"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(a4wide.sty) \
tex(calc.sty) \
tex(fancyhdr.sty) \
tex(fontenc.sty) \
tex(graphics.sty) \
tex(hyperref.sty) \
tex(inputenc.sty) \
tex(multicol.sty) \
tex(setspace.sty) \
tex(times.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
