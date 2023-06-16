SUMMARY = "Program to fill the console with Hollywood melodrama technobabble"
DESCRIPTION = "This utility will split the console into a multiple panes of genuine \
technobabble, perfectly suitable for any Hollywood geek melodrama. \
It is particularly suitable on any number of computer consoles in the \
background of any excellent schlock technothriller."
LICENSE = "Apache-2.0 & CC0-1.0"

PV = "1.21"

RPM_NAME = "hollywood-1.21-3.6.noarch.rpm"
RPM_HASH = "cadd6d83ebdb2ed648670f5617af3ebecf2b478b11957a6067eddd73aa0136f17bd7c2acad40107925604a8b0339d76b17c3afe5501704fbcd97455d4161caef"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hollywood"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
hollywood-data \
moreutils \
python3-Pygments \
tmux"

inherit rpm
