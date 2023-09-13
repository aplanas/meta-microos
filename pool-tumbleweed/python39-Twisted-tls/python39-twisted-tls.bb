SUMMARY = "TLS support for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional feature tls"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python39-Twisted-tls-22.10.0-8.1.noarch.rpm"
RPM_HASH = "e306fd1069a8312eb8c6518841fc2167e6ce5647a48882b4f49210e3fba2dfb616dee41a90c1005677505010b37d92cad9550859e157ab1ba9de4a88061145aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-Twisted-tls"

RDEPENDS:${PN} += "python39-Twisted \
python39-idna \
python39-pyOpenSSL \
python39-service-identity"

inherit rpm
