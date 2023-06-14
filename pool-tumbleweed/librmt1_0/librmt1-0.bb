SUMMARY = "Remote tape client interface library"
DESCRIPTION = "librmt offers a programmatic C interface for creating an IPC \
channel to the rmt program."
LICENSE = "CDDL-1.0"

PV = "2022.10.16"

RPM_NAME = "librmt1_0-2022.10.16-47.3.aarch64.rpm"
RPM_HASH = "40c329087092e11d39c4685310e776bf13bf6e236d807159228b848943d678846821be9c0cb7e15fdbd310f0dbfc6b526fe243bf6b4cf1a9116d9f6b1e29726b"

RPROVIDES:${PN} += "librmt.so.1.0 \
librmt1-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libschily.so.2.0"

inherit rpm
