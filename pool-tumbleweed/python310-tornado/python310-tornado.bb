SUMMARY = "A Python web framework and asynchronous networking library"
DESCRIPTION = "Tornado is a Python web framework and asynchronous networking library, \
originally developed at FriendFeed. By using non-blocking network I/O, Tornado \
can scale to tens of thousands of open connections, making it ideal for long \
polling, WebSockets, and other applications that require a long-lived \
connection to each user."
LICENSE = "Apache-2.0"

PV = "6.3.2"

RPM_NAME = "python310-tornado-6.3.2-16.3.noarch.rpm"
RPM_HASH = "4bfdece791faee36b773a45094b9c94bf3acdb89e9154f6b37772756227726f1db234e9b817da04076f41358a7da545debdc1d2177e30f5e5910f83c059531f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python310-tornado"

RDEPENDS:${PN} += "python310-tornado6"

inherit rpm
