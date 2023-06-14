SUMMARY = "A set of Python modules for IRC support"
DESCRIPTION = "This library is intended to encapsulate the IRC protocol at a quite \
low level. It provides an event-driven IRC client framework. It has \
a fairly thorough support for the basic IRC protocol, CTCP and DCC \
connections."
LICENSE = "LGPL-2.1-or-later"

PV = "19.0.1"

RPM_NAME = "python311-irc-19.0.1-1.8.noarch.rpm"
RPM_HASH = "4238910d0f24a8a27daf924d1c9fcbe4192f8ee5c0ddfe51807429f598d6777be8fbeb4432b825aa7a228ebbc2b549eb1cba67f93f8fc12c00b2f28c6fedd608"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-irc \
python311-irc \
python311-irclib \
python3dist-irc"

RDEPENDS:${PN} += "python-abi \
python311-importlib-metadata \
python311-jaraco.collections \
python311-jaraco.functools \
python311-jaraco.logging \
python311-jaraco.stream \
python311-jaraco.text \
python311-more-itertools \
python311-pytz \
python311-tempora"

inherit rpm
