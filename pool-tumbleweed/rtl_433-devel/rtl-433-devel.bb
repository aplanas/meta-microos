SUMMARY = "Header files for the RTL2832 dongle library"
DESCRIPTION = "Turns RTL2832 dongle into a 433.92MHz generic data receiver. \
 \
This subpackage contains header files for developing applications that want \
to make use of rtl_433."
LICENSE = "GPL-2.0-only"

PV = "22.11"

RPM_NAME = "rtl_433-devel-22.11-1.4.aarch64.rpm"
RPM_HASH = "c7a1cfaed6cecb6618e2b5950bf7f64274f2250f65d3a3cf4de6da5bc9875468c19915fae91a16e6fb23bb9d1dca96a33dbbe7ec0cbec1ed6ed5d5b5319bbfca"

RPROVIDES:${PN} += "rtl-433-devel"

RDEPENDS:${PN} += "rtl-433"

inherit rpm
