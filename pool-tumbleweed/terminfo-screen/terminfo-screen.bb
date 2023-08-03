SUMMARY = "A terminal descriptions database for screen"
DESCRIPTION = "This package includes some useful entries for the screen utility in the \
terminfo database, which might introduce trouble if used over network \
connections like ssh or slogin onto systems without those terminfo database \
entries."
LICENSE = "MIT"

PV = "6.4.20230715"

RPM_NAME = "terminfo-screen-6.4.20230715-17.1.aarch64.rpm"
RPM_HASH = "b780219eb325766cb55f45ceaaa15b7cc393ac76a325047f1a1e7539d94d9c3cfbf8f4ba48f49c7d9a54d750d7c9c602ef6773a667346fc6b7a6e6a6cffb0ea9"

RPROVIDES:${PN} += "terminfo-/usr/share/terminfo/s/screen.konsole \
terminfo-screen"

RDEPENDS:${PN} += "terminfo-base"

inherit rpm
