SUMMARY = "TLS support for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional feature tls"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python310-Twisted-tls-22.10.0-6.1.noarch.rpm"
RPM_HASH = "90468f52a4466b9d007cecd957cbcc27e60546a2846adc40a40541db4b271f05325bbc77f37f5718c3f2ce3f2cf2ebb2ff4ac367be065142885b73d4160f1af4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Twisted-tls \
python310-Twisted-tls"
RDEPENDS:${PN} += "python310-Twisted \
python310-idna \
python310-pyOpenSSL \
python310-service_identity"

inherit rpm
