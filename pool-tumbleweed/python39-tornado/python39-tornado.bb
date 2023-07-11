SUMMARY = "A Python web framework and asynchronous networking library"
DESCRIPTION = "Tornado is a Python web framework and asynchronous networking library, \
originally developed at FriendFeed. By using non-blocking network I/O, Tornado \
can scale to tens of thousands of open connections, making it ideal for long \
polling, WebSockets, and other applications that require a long-lived \
connection to each user."
LICENSE = "Apache-2.0"

PV = "6.3.2"

RPM_NAME = "python39-tornado-6.3.2-16.3.noarch.rpm"
RPM_HASH = "f2759e4755f70236a395e8972d595c8648f66b6e91ae9a94c802952f0c03aef269b8f08a497166a4f7e7ff9b22a565d2d43b10980d1f0c13367c410cc3eba413"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python39-tornado"

RDEPENDS:${PN} += "python39-tornado6"

inherit rpm
