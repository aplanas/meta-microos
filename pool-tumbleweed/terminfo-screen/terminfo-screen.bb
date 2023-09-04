SUMMARY = "A terminal descriptions database for screen"
DESCRIPTION = "This package includes some useful entries for the screen utility in the \
terminfo database, which might introduce trouble if used over network \
connections like ssh or slogin onto systems without those terminfo database \
entries."
LICENSE = "MIT"

PV = "6.4.20230812"

RPM_NAME = "terminfo-screen-6.4.20230812-18.1.aarch64.rpm"
RPM_HASH = "8bbeab71fca89b37eb81ceedba0185fed72de3116f8478a6511b8081b5b2644458670fc759dc1dec795a6e05ec81587ad7dee01a4ef1da20eaf49ae2b33dbadc"

RPROVIDES:${PN} += "terminfo-/usr/share/terminfo/s/screen.konsole \
terminfo-screen"

RDEPENDS:${PN} += "terminfo-base"

inherit rpm
