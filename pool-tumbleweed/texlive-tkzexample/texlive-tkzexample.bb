SUMMARY = "Package for the documentation of all tkz-* packages"
DESCRIPTION = "This package is needed to compile the documentation of all \
tkz-* packages (like tkz-euclide)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.45csvn63908"

RPM_NAME = "texlive-tkzexample-2023.209.1.45csvn63908-53.1.noarch.rpm"
RPM_HASH = "35a370e303c4e43f5c5f116dcf920472408736acc43f05284f801f72809c5275d62a0df7132b5420844054522801b185aef3fdb779045343cd35904573376da1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tkzexample.sty \
texlive-tkzexample"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-calc.sty \
tex-fancyvrb.sty \
tex-mdframed.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
