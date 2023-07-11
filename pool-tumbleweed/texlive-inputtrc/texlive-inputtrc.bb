SUMMARY = "Trace which file loads which"
DESCRIPTION = "The package produces screen/log messages of the form '<current> \
INPUTTING <next>' reporting LaTeX input commands (<current> and \
<next> being file names). The message is indented to reflect \
the level of input nesting. Tracing may be turned on and off, \
and the unit of indentation may be adjusted. The implementation \
somewhat resembles those of packages FiNK and inputfile."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.3svn28019"

RPM_NAME = "texlive-inputtrc-2023.208.0.0.3svn28019-53.1.noarch.rpm"
RPM_HASH = "79338ca9b260ad1353887626425e1348024169c93d5ae02dfaa998b36bbccef99c43ce1a048831bd6d3582365897b776314c8e1caf059aa5cbe29ec92ee81de7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-inputtrc.sty \
texlive-inputtrc"

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
