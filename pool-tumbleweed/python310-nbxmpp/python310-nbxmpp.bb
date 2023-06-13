SUMMARY = "XMPP library by Gajim team"
DESCRIPTION = "Python-nbxmpp is a Python library that provides a way for Python \
applications to use Jabber/XMPP networks in a non-blocking way. \
This library is initialy a fork of xmpppy one, but using \
non-blocking sockets."
LICENSE = "GPL-3.0-or-later"

PV = "4.2.2"

RPM_NAME = "python310-nbxmpp-4.2.2-1.1.noarch.rpm"
RPM_HASH = "9ccb8c2f1b21549443df3fa0375cf01e556ca3e3e15db277ba82e348170efcc70b30748936544310c4be254a8c37d9a7806171966d442362ab5886a03fbf5fff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nbxmpp \
python3.10dist(nbxmpp) \
python310-nbxmpp \
python3dist(nbxmpp)"

RDEPENDS:${PN} += "python(abi) \
python3.10dist(idna) \
python3.10dist(packaging) \
python3.10dist(precis-i18n) \
python3.10dist(pygobject)"

inherit rpm
