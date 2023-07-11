SUMMARY = "An asynchronous networking framework written in Python"
DESCRIPTION = "An extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration."
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python39-Twisted-22.10.0-7.1.noarch.rpm"
RPM_HASH = "9feacb41b6d7c222d882d0970ceb6b0f1030dd1ba0a24b15151b75ddf409fd67c190abe25cc37c67c23b0090e6671f8b161070b7fbe17dfe9a76d23453d719d7"
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
