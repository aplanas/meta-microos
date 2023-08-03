SUMMARY = "Framework for exercise problems"
DESCRIPTION = "This LaTeX2e package provides a general purpose framework to \
describe and typeset exercises and exam questions along with \
their solutions. The package features mechanisms to hide or \
postpone solutions, to assign and handle points, to collect \
problems on exercise sheets, to store and use metadata, and to \
implement a consistent numbering. It also provides a very \
flexible interface for configuring and customising the \
formatting, layout, and representation of the exercise content."
LICENSE = "LPPL-1.0"

PV = "2023.209.3.4svn53911"

RPM_NAME = "texlive-exframe-2023.209.3.4svn53911-53.1.noarch.rpm"
RPM_HASH = "1e3ec61b5cd33f2bc9cdc6ff8d05b3fcfde686f0e80f84416926c97bb21040995d3974093063690435bb0b2cdd57e46658f63dc133202729329bcd4ae78dcf95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-exframe.sty \
texlive-exframe"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-metastr.sty \
tex-verbatim.sty \
tex-xkeyval.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
