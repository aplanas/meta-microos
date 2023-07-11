SUMMARY = "An asynchronous networking framework written in Python"
DESCRIPTION = "An extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration."
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python311-Twisted-22.10.0-7.1.noarch.rpm"
RPM_HASH = "fb2a71e1e077dc4f44ad9cd06e63d9debdab3a1e2466004867d9a704fe5d23e348129f9e8c0ce3ce3a322eff47773dd8957361dd3d9fa66ad2257a1f36ead24e"
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
