SUMMARY = "A pure-Python implementation of the HTTP/2 priority tree"
DESCRIPTION = "Priority is a pure-Python implementation of the priority logic for HTTP/2, set \
out in `RFC 7540 Section 5.3 (Stream Priority)`. This logic allows for clients \
to express a preference for how the server allocates its (limited) resources to \
the many outstanding HTTP requests that may be running over a single HTTP/2 \
connection."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python311-priority-2.0.0-2.3.noarch.rpm"
RPM_HASH = "c08877472f72ca8d1fd09c83859561c82bdde7c8f8aa8acf8ccddc0f85e4327bbcbf64c7cfdd91de55fea515ef3aa0eb856c476c5d1931a483546e12d438fd30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-priority \
python3.11dist-priority \
python311-priority \
python3dist-priority"

RDEPENDS:${PN} += "python-abi"

inherit rpm
