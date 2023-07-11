SUMMARY = "XMPP library by Gajim team"
DESCRIPTION = "Python-nbxmpp is a Python library that provides a way for Python \
applications to use Jabber/XMPP networks in a non-blocking way. \
This library is initialy a fork of xmpppy one, but using \
non-blocking sockets."
LICENSE = "GPL-3.0-or-later"

PV = "4.3.1"

RPM_NAME = "python310-nbxmpp-4.3.1-1.2.noarch.rpm"
RPM_HASH = "5b2da683b6fe30177cd1db52ccd709de6b4f2e2ed4106ee80ca5872191ebf2647394f275fb99f7de57847dc1cab9af92b4e456c1c6d749424e6bf674ef0404a0"
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
