SUMMARY = "A pure-Python implementation of the HTTP/2 priority tree"
DESCRIPTION = "Priority is a pure-Python implementation of the priority logic for HTTP/2, set \
out in `RFC 7540 Section 5.3 (Stream Priority)`. This logic allows for clients \
to express a preference for how the server allocates its (limited) resources to \
the many outstanding HTTP requests that may be running over a single HTTP/2 \
connection."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python39-priority-2.0.0-2.3.noarch.rpm"
RPM_HASH = "77a25a74e231b3048d9f163a3b68d2c2e0b1cc9690d18cb7c3cc55f9c0eccf35d94a2bd94e720952535128496872ba4e3503ad294d391a6be23fce82898cc5a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-priority \
python39-priority \
python3dist-priority"

RDEPENDS:${PN} += "python-abi"

inherit rpm
