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

RPM_NAME = "rmw-0.9.1-1.1.aarch64.rpm"
RPM_HASH = "a47787279ae5bb5b08bb0b9f68bee897af2906441e641f67931906b50bea1938b815c214b353ae8ee0be28e5f1f7287b24c2a084889368903ac128dd7e407b95"

RPROVIDES:${PN} += "rmw"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libmenuw.so.6 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
