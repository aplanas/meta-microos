SUMMARY = "Key exchange and control message server for Magic-Wormhole"
DESCRIPTION = "The main server for Magic-Wormhole. This server performs \
store-and-forward delivery for small key-exchange and control \
messages. Bulk data is sent over a direct TCP connection, or through \
a transit-relay."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python39-magic-wormhole-mailbox-server-0.4.1-5.4.noarch.rpm"
RPM_HASH = "d684173d08e8105bcccb72c2a13f9a0be39749ccfe9ce1433ad8c50986745fcd57d4976965293d4afbe4bee23ef71e2b11973a552bf3dac9227b88b051c7f596"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-magic-wormhole-mailbox-server \
python39-magic-wormhole-mailbox-server \
python3dist-magic-wormhole-mailbox-server"

RDEPENDS:${PN} += "python-abi \
python39-Twisted-tls \
python39-attrs \
python39-autobahn"

inherit rpm
