SUMMARY = "A Python web framework and asynchronous networking library"
DESCRIPTION = "Tornado is a Python web framework and asynchronous networking library, \
originally developed at FriendFeed. By using non-blocking network I/O, Tornado \
can scale to tens of thousands of open connections, making it ideal for long \
polling, WebSockets, and other applications that require a long-lived \
connection to each user."
LICENSE = "Apache-2.0"

PV = "6.3.2"

RPM_NAME = "python311-tornado-6.3.2-16.3.noarch.rpm"
RPM_HASH = "00c940ea7415e397e5d71c396410c606459cd5db38117447bffc5147ade6de5fc91751d8727c47e95bf634d5ef389ca1797933f6a29af23bd713e321c65b525e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tornado \
python311-tornado"

RDEPENDS:${PN} += "python311-tornado6"

inherit rpm
