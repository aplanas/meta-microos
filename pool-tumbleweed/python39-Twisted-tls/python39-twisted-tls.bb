SUMMARY = "TLS support for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional feature tls"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python39-Twisted-tls-22.10.0-7.1.noarch.rpm"
RPM_HASH = "0551770018884e2436a149bb62737846f217eef579ff330e8dffc4c3072c904beace7b93b376432deeee17155fdab9ae721064ad87748bc2cee86f7a41af4445"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-Twisted-tls"

RDEPENDS:${PN} += "python39-Twisted \
python39-idna \
python39-pyOpenSSL \
python39-service-identity"

inherit rpm
