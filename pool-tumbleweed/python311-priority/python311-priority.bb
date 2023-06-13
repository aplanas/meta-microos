SUMMARY = "A pure-Python implementation of the HTTP/2 priority tree"
DESCRIPTION = "Priority is a pure-Python implementation of the priority logic for HTTP/2, set \
out in `RFC 7540 Section 5.3 (Stream Priority)`. This logic allows for clients \
to express a preference for how the server allocates its (limited) resources to \
the many outstanding HTTP requests that may be running over a single HTTP/2 \
connection."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-priority-2.0.0-2.1.noarch.rpm"
RPM_HASH = "0d7f747968e571ba90a2ee2dae3392fd702b2d045337512d181cecef9061e17091b5558eace20e08db2fa6e7198280c907f00b117e42c4babecd4cd5206952af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(priority) \
python311-priority \
python3dist(priority)"

RDEPENDS:${PN} += "python(abi)"

inherit rpm
