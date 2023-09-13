SUMMARY = "An asynchronous networking framework written in Python"
DESCRIPTION = "An extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration."
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python39-Twisted-22.10.0-8.1.noarch.rpm"
RPM_HASH = "85e5f7d68ff3afd62573e618a5c3ac14dbfb32dc6222343e27e49c6f7d4de1754c496e1933fb0aba5d2a5540cad08b65d58df414d10fcc988c77356fca0f73d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-twisted \
python39-Twisted \
python3dist-twisted"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
python-abi \
python39-Automat \
python39-Twisted-tls \
python39-attrs \
python39-constantly \
python39-hyperlink \
python39-incremental \
python39-typing-extensions \
python39-zope.interface \
update-alternatives"

inherit rpm
