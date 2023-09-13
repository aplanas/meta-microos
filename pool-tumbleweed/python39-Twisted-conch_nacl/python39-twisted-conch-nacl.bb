SUMMARY = "Conch w/ NaCl for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration."
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python39-Twisted-conch_nacl-22.10.0-8.1.noarch.rpm"
RPM_HASH = "7e3e99e5f28d348b7fa2818be145bd6ba6462a69f740de6cf605ae59450a5cdf7cbbb115c3f8a9e7f8873946142901387118056a58ce14ad6a04cd34ce84a43e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-Twisted-conch-nacl"

RDEPENDS:${PN} += "python39-Twisted-conch"

inherit rpm
