SUMMARY = "A pure-Python implementation of the HTTP/2 priority tree"
DESCRIPTION = "Priority is a pure-Python implementation of the priority logic for HTTP/2, set \
out in `RFC 7540 Section 5.3 (Stream Priority)`. This logic allows for clients \
to express a preference for how the server allocates its (limited) resources to \
the many outstanding HTTP requests that may be running over a single HTTP/2 \
connection."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python310-priority-2.0.0-2.3.noarch.rpm"
RPM_HASH = "951fc8bbd29bbb438b303543d2a87cc433873da78cede9a9d9d8eb3462e1b9b01230af2e7b4202022b0398fe8d6b4af93ecad71a71fae83aa4ec69c5d670bfe3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-priority \
python310-priority \
python3dist-priority"

RDEPENDS:${PN} += "python-abi"

inherit rpm
