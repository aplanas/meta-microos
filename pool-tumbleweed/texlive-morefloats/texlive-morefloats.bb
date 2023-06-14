SUMMARY = "Increase the number of simultaneous LaTeX floats"
DESCRIPTION = "LaTeX can, by default, only cope with 18 outstanding floats; \
any more, and you get the error 'too many unprocessed floats'. \
This package releases the limit; TeX itself imposes limits \
(which are independent of the help offered by e-TeX). However, \
if your floats can't be placed anywhere, extending the number \
of floats merely delays the arrival of the inevitable error \
message."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0hsvn37927"

RPM_NAME = "texlive-morefloats-2023.201.1.0hsvn37927-54.1.noarch.rpm"
RPM_HASH = "39c14b06edf12ea9cb522ef75fe011dc79f29943ed86e297faf479387126d0bc34f87050ee9d4df2abe4ae2da8ab0f2a63e406d2a58afcea6fc3d44823b3e34c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-morefloats.sty \
texlive-morefloats"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-ifetex.sty \
tex-kvoptions.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
