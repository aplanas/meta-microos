SUMMARY = "XMPP library by Gajim team"
DESCRIPTION = "Python-nbxmpp is a Python library that provides a way for Python \
applications to use Jabber/XMPP networks in a non-blocking way. \
This library is initialy a fork of xmpppy one, but using \
non-blocking sockets."
LICENSE = "GPL-3.0-or-later"

PV = "4.3.2"

RPM_NAME = "python310-nbxmpp-4.3.2-1.1.noarch.rpm"
RPM_HASH = "dc8daf2f150395bf719700762074c306e373a5dce3829cfea94f14d08aea37396f216972f2459c5abe66f1429271321b6af2094df8630b848e1d297fa0bd808d"
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
