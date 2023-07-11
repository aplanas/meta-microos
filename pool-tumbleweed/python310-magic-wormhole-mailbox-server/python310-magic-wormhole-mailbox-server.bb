SUMMARY = "Key exchange and control message server for Magic-Wormhole"
DESCRIPTION = "The main server for Magic-Wormhole. This server performs \
store-and-forward delivery for small key-exchange and control \
messages. Bulk data is sent over a direct TCP connection, or through \
a transit-relay."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python310-magic-wormhole-mailbox-server-0.4.1-5.4.noarch.rpm"
RPM_HASH = "d397eb49736ba811f4c95029d345bab16f701c009622dcb2be296c2b45032423bf61126001d88cb91487e85374c0d1cdd0b2ac3d67339170f4b0b142e8d5eb55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-magic-wormhole-mailbox-server \
python310-magic-wormhole-mailbox-server \
python3dist-magic-wormhole-mailbox-server"

RDEPENDS:${PN} += "python-abi \
python310-Twisted-tls \
python310-attrs \
python310-autobahn"

inherit rpm
