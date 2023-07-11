SUMMARY = "An asynchronous networking framework written in Python"
DESCRIPTION = "An extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration."
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python310-Twisted-22.10.0-7.1.noarch.rpm"
RPM_HASH = "6e6075e72ca226a625b21798f7c97f89a477f10bcb7306b4a607505b7b817964444ed097cd0fb22c3704f2574c366624fffe8b304a74ff8320cb98ce6df77f18"
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
