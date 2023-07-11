SUMMARY = "Safe-remove utility for the command line"
DESCRIPTION = "rmw (ReMove to Waste) is a safe-remove utility for the command line. It \
can move and restore files to and from directories specified in a \
configuration file, and can also be integrated with your regular \
desktop trash folder (if your desktop environment uses the \
FreeDesktop.org Trash specification). One of the unique features of rmw \
is the ability to purge items from your waste (or trash) directories \
after x number of days."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.1"

RPM_NAME = "rmw-0.9.1-1.2.aarch64.rpm"
RPM_HASH = "e18bb01b84b04b2a19fe4bfecc75c40b8e38edf8618c06309ef45e10901fde0e619df5e76aae307674dbd841f399c0a02b9d8e6e0bbeef3bea56faaf4cc0a61b"

RPROVIDES:${PN} += "rmw"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmenuw.so.6 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
