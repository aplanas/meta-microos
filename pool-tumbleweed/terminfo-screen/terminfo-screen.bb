SUMMARY = "A terminal descriptions database for screen"
DESCRIPTION = "This package includes some useful entries for the screen utility in the \
terminfo database, which might introduce trouble if used over network \
connections like ssh or slogin onto systems without those terminfo database \
entries."
LICENSE = "MIT"

PV = "6.4.20230819"

RPM_NAME = "terminfo-screen-6.4.20230819-19.1.aarch64.rpm"
RPM_HASH = "5a2a9261947e5a5a02f92b7dd0669f1ce521388ff2f6ec3aa1612f02c1c99112b10e43032fdcacef0fd844f8ffd943d99bda1a7261ee8999b8a913d3747f9449"

RPROVIDES:${PN} += "terminfo-/usr/share/terminfo/s/screen.konsole \
terminfo-screen"

RDEPENDS:${PN} += "terminfo-base"

inherit rpm
