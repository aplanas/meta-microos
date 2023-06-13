SUMMARY = "Use a modifier key as another key"
DESCRIPTION = "xcape allows you to use a modifier key as another key when pressed and released \
on its own. The default behaviour is to generate the Escape key when Left Control \
is pressed and released on its own."
LICENSE = "GPL-3.0"

PV = "1.2"

RPM_NAME = "xcape-1.2-1.9.aarch64.rpm"
RPM_HASH = "a2a083f726303250d6672e74f441e7f2ea26c7ba8f529b91b658ffc6280e89bb4d5b279f2a13e51cabf035e861e63d876f301763167ef4e33133109a25d1a987"

RPROVIDES:${PN} += "xcape \
xcape(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libXtst.so.6()(64bit) \
libc.so.6()(64bit)"

inherit rpm
