SUMMARY = "Apply a command to a list of items"
DESCRIPTION = "The package provides macros for applying a command to all \
elements of a list without separators, such as \
'\\DoWithAllIn{<cmd>}{<list-macro>}', and also for extending and \
reducing macros storing such lists. Applications in mind \
belonged to LaTeX, but the package should work with other \
formats as well. Loop and list macros in other packages are \
discussed. A further package, domore, is also provided, which \
enhances the functionality of dowith."
LICENSE = "LPPL-1.0"

PV = "2023.209.r0.32svn38860"

RPM_NAME = "texlive-dowith-2023.209.r0.32svn38860-53.1.noarch.rpm"
RPM_HASH = "feccfb3bc963e300a75400dd6c715aec1f094af79bc15d10b2c8c931f463d954b553a5aa73d58ee103686dec09ce7494cb7c018e2b78755bc4b5ec21da683756"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-domore.sty \
tex-dowith.sty \
texlive-dowith"

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
