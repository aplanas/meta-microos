SUMMARY = "Paragraphs with last line centered, known as 'Spanish' paragraphs"
DESCRIPTION = "This LaTeX package provides a command \\centerlastline and an \
environment centerlastline that typeset 'Spanish' paragraphs, \
that is paragraphs without indentation, and last line centered, \
useful to finish a large paragraph of text at the end of \
chapters, prologues, etc."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn56644"

RPM_NAME = "texlive-centerlastline-2023.209.1.0svn56644-53.1.noarch.rpm"
RPM_HASH = "bc360cda0dc7cad7140c6d8a99c7cd1892ceaccaeba601f69bfe24b161f64afef36b9100f352e9898279be940e9507c655c331f7bce429183469d12b25d44d88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-centerlastline.sty \
texlive-centerlastline"

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
