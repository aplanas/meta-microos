SUMMARY = "A set of Python modules for IRC support"
DESCRIPTION = "This library is intended to encapsulate the IRC protocol at a quite \
low level. It provides an event-driven IRC client framework. It has \
a fairly thorough support for the basic IRC protocol, CTCP and DCC \
connections."
LICENSE = "LGPL-2.1-or-later"

PV = "19.0.1"

RPM_NAME = "python39-irc-19.0.1-1.8.noarch.rpm"
RPM_HASH = "c591952cd5b1a257956be76ad5926eeee76a9da147df364d7f03e1c5b606ec1634255acb7a5fead6ffd1d4cf9e405aa7f01dc946de74e26fd5cc752b4d38d14b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-irc \
python39-irc \
python39-irclib \
python3dist-irc"

RDEPENDS:${PN} += "python-abi \
python39-importlib-metadata \
python39-jaraco.collections \
python39-jaraco.functools \
python39-jaraco.logging \
python39-jaraco.stream \
python39-jaraco.text \
python39-more-itertools \
python39-pytz \
python39-tempora"

inherit rpm
