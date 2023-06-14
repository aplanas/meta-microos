SUMMARY = "Conch w/ NaCl for Twisted"
DESCRIPTION = "Twisted is an extensible framework for Python programming, with special focus \
on event-based network programming and multiprotocol integration. \
 \
This metapackage is for the optional feature Conch with NaCl"
LICENSE = "MIT"

PV = "22.10.0"

RPM_NAME = "python310-Twisted-conch_nacl-22.10.0-6.1.noarch.rpm"
RPM_HASH = "544ba37ea9a696ea9992c3d15ea532af4ebc1d93bc7c0bb8dbe3ab552401af4d8b6bb576a30f6391e37b6b35699e562d1f29d9e2aaa8e365394eb0bda484a26f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-Twisted-conch-nacl \
python310-Twisted-conch-nacl"

RDEPENDS:${PN} += "python310-PyNaCl \
python310-Twisted-conch"

inherit rpm
