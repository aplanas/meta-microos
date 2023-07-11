SUMMARY = "A terminal descriptions database for screen"
DESCRIPTION = "This package includes some useful entries for the screen utility in the \
terminfo database, which might introduce trouble if used over network \
connections like ssh or slogin onto systems without those terminfo database \
entries."
LICENSE = "MIT"

PV = "6.4.20230617"

RPM_NAME = "terminfo-screen-6.4.20230617-15.1.aarch64.rpm"
RPM_HASH = "00f2b4753a998019bc649f7f2e292ce8e8086986e15f71ea2755fd30a969167a7518f1b57c04550635f72bef0659aa883abb28b36a5196fc1782b95cff9becba"

RPROVIDES:${PN} += "terminfo-/usr/share/terminfo/s/screen.konsole \
terminfo-screen"

RDEPENDS:${PN} += "terminfo-base"

inherit rpm
