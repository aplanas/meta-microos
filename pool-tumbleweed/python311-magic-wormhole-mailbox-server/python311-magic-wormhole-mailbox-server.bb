SUMMARY = "Key exchange and control message server for Magic-Wormhole"
DESCRIPTION = "The main server for Magic-Wormhole. This server performs \
store-and-forward delivery for small key-exchange and control \
messages. Bulk data is sent over a direct TCP connection, or through \
a transit-relay."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "python311-magic-wormhole-mailbox-server-0.4.1-5.4.noarch.rpm"
RPM_HASH = "9dd121130e3388f8ee6cff139e1d0d8531a57127fbdbef5292cf6f2964f9aea79335d177967d8b54527354a0ceaa3b5472eb6f6ad6ea228ba797a1303f2e7026"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-magic-wormhole-mailbox-server \
python3.11dist-magic-wormhole-mailbox-server \
python311-magic-wormhole-mailbox-server \
python3dist-magic-wormhole-mailbox-server"

RDEPENDS:${PN} += "python-abi \
python311-Twisted-tls \
python311-attrs \
python311-autobahn"

inherit rpm
