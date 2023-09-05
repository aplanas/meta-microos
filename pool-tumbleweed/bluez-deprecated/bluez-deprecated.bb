SUMMARY = "Bluez tools that upstream considers obsolete"
DESCRIPTION = "This package contains tools from the bluez package that are only built \
if the '--enable-deprecated' switch is used. These are considered obsolete \
by the upstream developers and might contain serious issues, even security \
bugs. Use at your own risk. \
 \
Note that this package will go away before end of 2020, change your code \
to use the modern tools instead."
LICENSE = "GPL-2.0-or-later"

PV = "5.68"

RPM_NAME = "bluez-deprecated-5.68-4.2.aarch64.rpm"
RPM_HASH = "35b8782cc5e94097360eb3e0e543c4ebbfbb0938fe9dd83548679dee7c3eb89d914dc7c1eeee03997c3542bc908fbd60912590794ecad76722f35ee7b64fa8c6"

RPROVIDES:${PN} += "bluez-deprecated"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libreadline.so.8 \
libudev.so.1"

inherit rpm
