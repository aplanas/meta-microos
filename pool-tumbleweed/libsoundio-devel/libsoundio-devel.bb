SUMMARY = "Development files for libsoundio"
DESCRIPTION = "A C99 library for realtime audio input/output. \
 \
This package contains header files and libraries needed to develop \
application that use libsoundio."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "libsoundio-devel-2.0.0-1.11.aarch64.rpm"
RPM_HASH = "44445bc6c885f42291ee14f0b9946f0e43d9fe2602cda2d430eaf5807337e9aeac02f0ad1000ea3fc249b5e2bbb110040c69cf1dcae82b05c49439d91d704b1f"

RPROVIDES:${PN} += "libsoundio-devel"

RDEPENDS:${PN} += "libsoundio2"

inherit rpm
