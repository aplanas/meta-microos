SUMMARY = "Simple editor for Markdown and reStructuredText"
DESCRIPTION = "ReText is simple text editor that supports Markdown and reStructuredText \
markup languages. It is written in Python using PyQt libraries."
LICENSE = "GPL-3.0-or-later"

PV = "7.2.3"

RPM_NAME = "retext-7.2.3-1.4.noarch.rpm"
RPM_HASH = "800efbb48c24afe598da433e225c3972c35184d6782786f64f67d200e91aba7abc8c16060a2eba1d1af6000ccf61aae08dacd944926dc1784d07713c23a319cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ReText \
python3.11dist-retext \
python3dist-retext \
retext"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-Markdown \
python3-Markups \
python3-docutils \
python3-pyenchant \
python3-qt5"

inherit rpm
