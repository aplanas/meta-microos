SUMMARY = "LaTeX-relevant log information for debugging"
DESCRIPTION = "The package logs LaTeX's progress through the file, making the \
LaTeX output more verbose. This helps to make LaTeX debugging \
easier, as it is simpler to find where exactly LaTeX failed. \
The package outputs the typesetting of section, subsection and \
subsubsection headers and (if amsmath is loaded) details of the \
align environment."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn15878"

RPM_NAME = "texlive-dprogress-2023.209.0.0.1svn15878-53.1.noarch.rpm"
RPM_HASH = "7dde1712d25ee34530da746a6f24da74a90e65f5b4e0cdafd2a0e6f08fb414ec8d0e3a059298f62fdbb3dd942424100587d1b8e13f27dd0fd3cde786c3afb60f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-dprogress.sty \
texlive-dprogress"

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
