SUMMARY = "A Python web framework and asynchronous networking library"
DESCRIPTION = "Tornado is a Python web framework and asynchronous networking library, \
originally developed at FriendFeed. By using non-blocking network I/O, Tornado \
can scale to tens of thousands of open connections, making it ideal for long \
polling, WebSockets, and other applications that require a long-lived \
connection to each user."
LICENSE = "Apache-2.0"

PV = "6.3.2"

RPM_NAME = "python311-tornado-6.3.2-16.2.noarch.rpm"
RPM_HASH = "7a2f58b2e3a644e6081ec1e78490cb3ce339ea34bc1507eb3567eed1324df0e5ca5b087be5aa4ace4ef5ac735fb05b09a9ab05975248347fc9e6de27ca0fafa3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-tornado"

RDEPENDS:${PN} += "python311-tornado6"

inherit rpm
