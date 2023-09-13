SUMMARY = "An asynchronous networking framework written in Python"
DESCRIPTION = "An extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration."
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python311-Twisted-22.10.0-8.1.noarch.rpm"
RPM_HASH = "26f3a3f5c636d14f7a44234ef9108428a1a291681904ce2f1812f03cbd1443f797d085a6a73da96095313f3aba0276223062961d37691bf32f5247e8d6a3486c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Twisted \
python3.11dist-twisted \
python311-Twisted \
python3dist-twisted"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-Automat \
python311-Twisted-tls \
python311-attrs \
python311-constantly \
python311-hyperlink \
python311-incremental \
python311-typing-extensions \
python311-zope.interface \
update-alternatives"

inherit rpm
