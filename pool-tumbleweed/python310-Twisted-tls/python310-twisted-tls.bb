SUMMARY = "TLS support for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional feature tls"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python310-Twisted-tls-22.10.0-7.1.noarch.rpm"
RPM_HASH = "e331dcf1ea74332adff3a72aba25850adba70b4fcd779e8f04d266ada32a5c6cda721a5646562affcb41ad59d28b34d96123b6da222d69ec9a42b0e7e66e0cd9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-Twisted-tls"

RDEPENDS:${PN} += "python310-Twisted \
python310-idna \
python310-pyOpenSSL \
python310-service-identity"

inherit rpm
