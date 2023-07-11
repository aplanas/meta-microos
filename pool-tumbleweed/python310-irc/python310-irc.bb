SUMMARY = "A set of Python modules for IRC support"
DESCRIPTION = "This library is intended to encapsulate the IRC protocol at a quite \
low level. It provides an event-driven IRC client framework. It has \
a fairly thorough support for the basic IRC protocol, CTCP and DCC \
connections."
LICENSE = "LGPL-2.1-or-later"

PV = "19.0.1"

RPM_NAME = "python310-irc-19.0.1-1.10.noarch.rpm"
RPM_HASH = "124cd154919ffc2c0ea2cff83e96a3d93053e918716cc42d44441059378e51d4e2a5b5226e78be81cd55746699be6b1012114e00158be483f0e9282498fa3636"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-irc \
python310-irc \
python310-irclib \
python3dist-irc"

RDEPENDS:${PN} += "python-abi \
python310-importlib-metadata \
python310-jaraco.collections \
python310-jaraco.functools \
python310-jaraco.logging \
python310-jaraco.stream \
python310-jaraco.text \
python310-more-itertools \
python310-pytz \
python310-tempora"

inherit rpm
