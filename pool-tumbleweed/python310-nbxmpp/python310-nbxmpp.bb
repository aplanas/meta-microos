SUMMARY = "XMPP library by Gajim team"
DESCRIPTION = "Python-nbxmpp is a Python library that provides a way for Python \
applications to use Jabber/XMPP networks in a non-blocking way. \
This library is initialy a fork of xmpppy one, but using \
non-blocking sockets."
LICENSE = "GPL-3.0-or-later"

PV = "4.3.3"

RPM_NAME = "python310-nbxmpp-4.3.3-1.1.noarch.rpm"
RPM_HASH = "3d60aeb6313a079d43704b2d19ad10608cb86ee9cc6188ab98cdd61fd22e6bdd667b4f782d30af08d500c835e94501eb2b5907a0a68eb376c4f6f15e0717055e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-nbxmpp \
python310-nbxmpp \
python3dist-nbxmpp"

RDEPENDS:${PN} += "python-abi \
python3.10dist-idna \
python3.10dist-packaging \
python3.10dist-precis-i18n \
python3.10dist-pygobject"

inherit rpm
