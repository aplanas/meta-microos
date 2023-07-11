SUMMARY = "TLS support for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional feature tls"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python311-Twisted-tls-22.10.0-7.1.noarch.rpm"
RPM_HASH = "fb624d649776f6eebaf74a27acd1c0412553385d494fdc269359434f871e66455e88c85b62c57d40b25551ea1f4f063e83dc720369ba1d410876315f7fafae2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Twisted-tls \
python311-Twisted-tls"

RDEPENDS:${PN} += "python311-Twisted \
python311-idna \
python311-pyOpenSSL \
python311-service-identity"

inherit rpm
