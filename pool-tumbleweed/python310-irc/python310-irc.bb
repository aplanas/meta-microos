SUMMARY = "A set of Python modules for IRC support"
DESCRIPTION = "This library is intended to encapsulate the IRC protocol at a quite \
low level. It provides an event-driven IRC client framework. It has \
a fairly thorough support for the basic IRC protocol, CTCP and DCC \
connections."
LICENSE = "LGPL-2.1-or-later"

PV = "19.0.1"

RPM_NAME = "python310-irc-19.0.1-1.8.noarch.rpm"
RPM_HASH = "51f5d9c95f4407a1335d304b24c00b9aa86f6e398ed18e34133bb43c9a1ca6476eaddcdd6bffca3fe5dbc79b3e236537a4d8301a1d7d5ede5bfafec3e3816a56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-irc \
python3-irclib \
python3.10dist-irc \
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
