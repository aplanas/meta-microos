SUMMARY = "Make JSON greppable"
DESCRIPTION = "gron transforms JSON into discrete assignments to make it easier \
to grep for what you want and see the absolute 'path' to it. It \
eases the exploration of APIs that return large blobs of JSON but \
have terrible documentation."
LICENSE = "MIT"

PV = "0.7.1"

RPM_NAME = "gron-0.7.1-1.7.aarch64.rpm"
RPM_HASH = "431170f9838979a2c674a5379c5fce603de76f005f034b0581cbd6550a7110f79dd512ceec69f5015e55358db0d074d3c107caa130f8c82426c075137b4405cb"

RPROVIDES:${PN} += "gron"

RDEPENDS:${PN} += ""

inherit rpm
