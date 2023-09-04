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

RPM_NAME = "bluez-deprecated-5.68-4.1.aarch64.rpm"
RPM_HASH = "7c74e214a4e10d3893aed82a75b57ef517d8383c9d6b656f0431675049c60fc9d162a68fa7e83501759e4168d4d998f477c10727c07a50753a044e2d84329c8d"

RPROVIDES:${PN} += "bluez-deprecated"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libreadline.so.8 \
libudev.so.1"

inherit rpm
