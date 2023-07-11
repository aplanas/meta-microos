SUMMARY = "C++ development files for OpenWSMAN"
DESCRIPTION = "OpenWSMAN is an implementation of the WS-Management protocol stack. \
 \
Development files for the C++ interface to the OpenWSMAN client library."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "2.7.2"

RPM_NAME = "libwsman_clientpp-devel-2.7.2-2.8.aarch64.rpm"
RPM_HASH = "f984d7288430f8753e141ec6706d4d5878b7fc9f5ac7a1e320b568563a329365d8aaeb94227cfc076c4ba538a97e13082ac80c357103791e07393579c0b701ec"

RPROVIDES:${PN} += "libwsman-clientpp-devel"

RDEPENDS:${PN} += "libwsman-clientpp1 \
libwsman-devel"

inherit rpm
