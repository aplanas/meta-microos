SUMMARY = "XMPP library by Gajim team"
DESCRIPTION = "Python-nbxmpp is a Python library that provides a way for Python \
applications to use Jabber/XMPP networks in a non-blocking way. \
This library is initialy a fork of xmpppy one, but using \
non-blocking sockets."
LICENSE = "GPL-3.0-or-later"

PV = "4.3.2"

RPM_NAME = "python311-nbxmpp-4.3.2-1.1.noarch.rpm"
RPM_HASH = "c773a8d9516325f87feca32cf9a57bd186b899f01bba503d2ea2d8331bfe3a98e84010d8d45e0c737aef62dd81846df00fe045905ab52f9361539c9d10066bfa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-nbxmpp \
python3.11dist-nbxmpp \
python311-nbxmpp \
python3dist-nbxmpp"

RDEPENDS:${PN} += "python-abi \
python3.11dist-idna \
python3.11dist-packaging \
python3.11dist-precis-i18n \
python3.11dist-pygobject"

inherit rpm
