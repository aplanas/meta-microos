SUMMARY = "A Python web framework and asynchronous networking library"
DESCRIPTION = "Tornado is a Python web framework and asynchronous networking library, \
originally developed at FriendFeed. By using non-blocking network I/O, Tornado \
can scale to tens of thousands of open connections, making it ideal for long \
polling, WebSockets, and other applications that require a long-lived \
connection to each user."
LICENSE = "Apache-2.0"

PV = "6.3.2"

RPM_NAME = "python310-tornado-6.3.2-16.2.noarch.rpm"
RPM_HASH = "c70c0f9582e9085ed58d2e719df34ce1d2fba879383b7d649cd56f5b84809e38b847d7fa64a2c05780304d72dbe90745f42cbe91b48aa1e62a20e62a73a69f80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-tornado \
python310-tornado"

RDEPENDS:${PN} += "python310-tornado6"

inherit rpm
