SUMMARY = "An asynchronous networking framework written in Python"
DESCRIPTION = "An extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration."
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python310-Twisted-22.10.0-8.1.noarch.rpm"
RPM_HASH = "3244653ce053c915dc9ab46655ad3120a852f383d0dfe75de04a1e314c506a62dcfe84784568975fec484c6b5bd74e5193c93e35fa13c21bd2e04435d105679c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-twisted \
python310-Twisted \
python3dist-twisted"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
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
