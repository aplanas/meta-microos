SUMMARY = "Trace which file loads which"
DESCRIPTION = "The package produces screen/log messages of the form '<current> \
INPUTTING <next>' reporting LaTeX input commands (<current> and \
<next> being file names). The message is indented to reflect \
the level of input nesting. Tracing may be turned on and off, \
and the unit of indentation may be adjusted. The implementation \
somewhat resembles those of packages FiNK and inputfile."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn28019"

RPM_NAME = "texlive-inputtrc-2023.209.0.0.3svn28019-54.1.noarch.rpm"
RPM_HASH = "550ae344096001980513fa8fbaa7da6761d3e152ce5888d5f0aa40aef153880224ed50755e6a9595b697ef70bd9e999b07fc1718d22b14da16943a6bf6a528e8"
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
