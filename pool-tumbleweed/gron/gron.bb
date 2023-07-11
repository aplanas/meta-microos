SUMMARY = "Make JSON greppable"
DESCRIPTION = "gron transforms JSON into discrete assignments to make it easier \
to grep for what you want and see the absolute 'path' to it. It \
eases the exploration of APIs that return large blobs of JSON but \
have terrible documentation."
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "gron-0.7.1-1.8.aarch64.rpm"
RPM_HASH = "2b150c53327cb22da98960465c8a98de75586d9a33178cee4376e784607b4850d34a033caf285cce26ff2c189d791f12e614399a12ffb1318178381a8d6ad203"

RPROVIDES:${PN} += "gron"

RDEPENDS:${PN} += ""

inherit rpm
