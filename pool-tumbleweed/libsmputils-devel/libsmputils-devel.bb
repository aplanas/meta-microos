SUMMARY = "Development files for the SAS SMP Expander Control Library"
DESCRIPTION = "The smp_utils package contains utilities for the Serial Attached SCSI \
(SAS) Management Protocol (SMP). \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libsmputils."
LICENSE = "BSD-3-Clause & GPL-2.0-only"

PV = "0.99"

RPM_NAME = "libsmputils-devel-0.99-2.10.aarch64.rpm"
RPM_HASH = "05eb07b85ad75ad0586e7b9faff760093408da8de1cb1082437897ea373ef785a1e0c5acbfe05961d4bd022be5260ce604d3c49f11fe302effc786004b01d0ca"

RPROVIDES:${PN} += "libsmputils-devel"

RDEPENDS:${PN} += "libsmputils1-1"

inherit rpm
