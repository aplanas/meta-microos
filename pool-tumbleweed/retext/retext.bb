SUMMARY = "Simple editor for Markdown and reStructuredText"
DESCRIPTION = "ReText is simple text editor that supports Markdown and reStructuredText \
markup languages. It is written in Python using PyQt libraries."
LICENSE = "GPL-3.0-or-later"

PV = "7.2.3"

RPM_NAME = "retext-7.2.3-1.3.noarch.rpm"
RPM_HASH = "b4c786d09d1a1142d428888457cc97c33e1576e427e0b233a6ada6e60cd14f383449c18d3e259223581afc161e3ff1c58d6d69f693064b80afd57875b4cbbaf1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ReText \
application() \
application(me.mitya57.ReText.desktop) \
metainfo() \
metainfo(me.mitya57.ReText.appdata.xml) \
mimehandler(text/markdown) \
mimehandler(text/x-rst) \
python3.10dist(retext) \
python3dist(retext) \
retext"

RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi) \
python3-Markdown \
python3-Markups \
python3-docutils \
python3-pyenchant \
python3-qt5"

inherit rpm
