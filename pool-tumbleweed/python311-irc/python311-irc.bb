SUMMARY = "A set of Python modules for IRC support"
DESCRIPTION = "This library is intended to encapsulate the IRC protocol at a quite \
low level. It provides an event-driven IRC client framework. It has \
a fairly thorough support for the basic IRC protocol, CTCP and DCC \
connections."
LICENSE = "LGPL-2.1-or-later"

PV = "19.0.1"

RPM_NAME = "python311-irc-19.0.1-1.10.noarch.rpm"
RPM_HASH = "f3bc965da1e15ee88d39cda26e7999780a9ad37be380bb8ee7c66414962b382360fade4e6817c3b6d7638dc2513efde6539f357ef8e5f92fd7c458e7859ed970"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-irc \
python3-irclib \
python3.11dist-irc \
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
