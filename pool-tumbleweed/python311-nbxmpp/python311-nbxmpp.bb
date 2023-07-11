SUMMARY = "XMPP library by Gajim team"
DESCRIPTION = "Python-nbxmpp is a Python library that provides a way for Python \
applications to use Jabber/XMPP networks in a non-blocking way. \
This library is initialy a fork of xmpppy one, but using \
non-blocking sockets."
LICENSE = "GPL-3.0-or-later"

PV = "4.3.1"

RPM_NAME = "python311-nbxmpp-4.3.1-1.2.noarch.rpm"
RPM_HASH = "aa302cf11e3745b1f95aaa050a383ec9d9473a0024d070d2737ed4117163e19af11b1e86b48255ae3d6b9fdf8ac6bf3eef9191f90aac536edbda381a750cecfa"
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
