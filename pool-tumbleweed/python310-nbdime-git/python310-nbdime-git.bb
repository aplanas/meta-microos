SUMMARY = "Git integration for python-nbdime"
DESCRIPTION = "The nbdime package provides tools for diffing and merging of \
Jupyter Notebooks. \
 \
This package provides git integration."
LICENSE = "BSD-3-Clause"

PV = "3.2.1"

RPM_NAME = "python310-nbdime-git-3.2.1-15.1.noarch.rpm"
RPM_HASH = "1b40c83eb678eb35eb96aae2ec209a07d294b9be6b73706c41a3f615caaafb8d271ca6e036a7ac41f2666454510de90444dd7f68f278890e57052e26246cbf6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-jupyter-nbdime-git \
python310-nbdime-git"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
alts \
git-core \
python310-nbdime"

inherit rpm
