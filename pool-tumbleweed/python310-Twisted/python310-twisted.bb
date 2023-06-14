SUMMARY = "An asynchronous networking framework written in Python"
DESCRIPTION = "An extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration."
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python310-Twisted-22.10.0-6.1.noarch.rpm"
RPM_HASH = "2a9f381e12c03ca720dbc9c410e01f51deb1ccf555825cf103a52979938ed3d0664ae575c08b3a0c819856ccf06308cb2642bc377109064de5b378d58ceccdb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Twisted \
python3.10dist-twisted \
python310-Twisted \
python3dist-twisted"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
python-abi \
python310-Automat \
python310-Twisted-tls \
python310-attrs \
python310-constantly \
python310-hyperlink \
python310-incremental \
python310-typing-extensions \
python310-zope.interface \
update-alternatives"

inherit rpm
