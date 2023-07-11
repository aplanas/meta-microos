SUMMARY = "A set of Python modules for IRC support"
DESCRIPTION = "This library is intended to encapsulate the IRC protocol at a quite \
low level. It provides an event-driven IRC client framework. It has \
a fairly thorough support for the basic IRC protocol, CTCP and DCC \
connections."
LICENSE = "LGPL-2.1-or-later"

PV = "19.0.1"

RPM_NAME = "python39-irc-19.0.1-1.10.noarch.rpm"
RPM_HASH = "05528a1f9a84915a53708f9daafd0192b3d9e04617cb51b55919c9b0ddc88dd97887cee2a1e29627648af84bb87bcc802a3ff000fd0c1196bf8304eabb6f096f"
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
