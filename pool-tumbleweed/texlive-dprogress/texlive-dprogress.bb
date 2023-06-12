SUMMARY = "LaTeX-relevant log information for debugging"
DESCRIPTION = "The package logs LaTeX's progress through the file, making the \
LaTeX output more verbose. This helps to make LaTeX debugging \
easier, as it is simpler to find where exactly LaTeX failed. \
The package outputs the typesetting of section, subsection and \
subsubsection headers and (if amsmath is loaded) details of the \
align environment."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn15878"

RPM_NAME = "texlive-dprogress-2023.201.0.0.1svn15878-52.1.noarch.rpm"
RPM_HASH = "7d5167608a9bed95f81815dd9e6e9d9e7daa4001e92134c1439c50786059cef2c544119275cab212acb88f66035e617a75042b919882fd506648135c619e505b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(dprogress.sty) \
texlive-dprogress"
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
