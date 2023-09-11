SUMMARY = "XMPP library by Gajim team"
DESCRIPTION = "Python-nbxmpp is a Python library that provides a way for Python \
applications to use Jabber/XMPP networks in a non-blocking way. \
This library is initialy a fork of xmpppy one, but using \
non-blocking sockets."
LICENSE = "GPL-3.0-or-later"

PV = "4.3.3"

RPM_NAME = "python311-nbxmpp-4.3.3-1.1.noarch.rpm"
RPM_HASH = "63d5753b125519715efe59b0881a1c083b08e5a2508f7642d0b2030b37a498008a2463c09bb6021947629aa3a67dd383a6bab4c51a6e655c98e964bc47561a6a"
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
