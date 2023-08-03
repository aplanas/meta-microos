SUMMARY = "Embed Python code in LaTeX"
DESCRIPTION = "The package enables you to embed Python code in LaTeX, and \
insert the script's output in the document."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.22svn60162"

RPM_NAME = "texlive-python-2023.209.0.0.22svn60162-54.1.noarch.rpm"
RPM_HASH = "fea3bc5a56d81d0be9cab3511e7bc8b95fc85984cbef780c340f19c1def819ba915625ea58c52245e86ec659491a43dac6b0fe44ccfddc5f3d8d6f544359afcb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-python.sty \
texlive-python"

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
