SUMMARY = "Support for PSTricks in pdfTeX"
DESCRIPTION = "The PSTricks macros cannot be used (directly) with pdfTeX, \
since PSTricks uses PostScript arithmetic, which isn't part of \
PDF. This package circumvents this limitation so that the \
extensive facilities offered by the powerful PSTricks package \
can be made use of in a pdfTeX document. This is done using the \
shell escape function available in current TeX implementations. \
The package may also be used in support of other \
'PostScript-output-only' packages, such as PSfrag. For \
alternatives, users may care to review the discussion in the \
PSTricks online documentation."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.16svn15878"

RPM_NAME = "texlive-pdftricks-2023.209.1.16svn15878-52.1.noarch.rpm"
RPM_HASH = "96d583a8233afafbf047262d37692ae6e1767dadb9539dabb608b54eb25da7c28be4e83ab965467ea4f38f8a04f45dd2e7f5c4979690b6149ceebfc67bdcfaa1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdftricks.sty \
texlive-pdftricks"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-color.sty \
tex-graphicx.sty \
tex-keyval.sty \
tex-moreverb.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
