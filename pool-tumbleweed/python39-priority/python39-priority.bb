SUMMARY = "A pure-Python implementation of the HTTP/2 priority tree"
DESCRIPTION = "Priority is a pure-Python implementation of the priority logic for HTTP/2, set \
out in `RFC 7540 Section 5.3 (Stream Priority)`. This logic allows for clients \
to express a preference for how the server allocates its (limited) resources to \
the many outstanding HTTP requests that may be running over a single HTTP/2 \
connection."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python39-priority-2.0.0-2.1.noarch.rpm"
RPM_HASH = "37116729b9794eab3dcb80a08b9cb21dab227cc89ad6957a66a0c3f1816499a79778288b6761c8866b99287351415bdebae105915ada0463fa9538a841b6284e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(priority) \
python39-priority \
python3dist(priority)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
