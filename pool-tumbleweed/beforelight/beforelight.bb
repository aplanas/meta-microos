SUMMARY = "Sample implementation of a screen saver for X servers"
DESCRIPTION = "The beforelight program is a sample implementation of a screen saver \
for X servers supporting the MIT-SCREEN-SAVER extension. It is only \
recommended for use as a code sample, as it does not include features \
such as screen locking or configurability, and relies on the legacy Xaw \
toolkit."
LICENSE = "MIT"

PV = "1.0.6"

RPM_NAME = "beforelight-1.0.6-1.2.aarch64.rpm"
RPM_HASH = "e7e9af8068f8e0d99e735d4b1ea43e41296353266c356a742381d14af720f4ea403db10ccedf60de63ab60d6b3db7bd2a1970c9610936a1a0e817a1399f3e903"

RPROVIDES:${PN} += "beforelight \
beforelight(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXss.so.1()(64bit) \
libXt.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit)"

inherit rpm
