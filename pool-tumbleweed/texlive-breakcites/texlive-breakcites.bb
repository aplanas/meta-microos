SUMMARY = "Ensure that multiple citations may break at line end"
DESCRIPTION = "Makes a very minor change to the operation of the \\cite \
command. Note that the change is not necessary in unmodified \
LaTeX; however, there remain packages that restore the \
undesirable behaviour of the command as provided in LaTeX 2.09. \
(Note that neither cite nor natbib make this mistake.)"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn21014"

RPM_NAME = "texlive-breakcites-2023.201.svn21014-52.1.noarch.rpm"
RPM_HASH = "4aaea3f8ce0ed55fd20d5b71284aabcc890b720e6b7227dae4fe3ba8df60905fc23e2d0bf85dd9f3f00161cf5cafe2b43159e8f6c6c354466b3a421977773add"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(breakcites.sty) \
texlive-breakcites"
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
