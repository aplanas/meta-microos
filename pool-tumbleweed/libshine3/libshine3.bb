SUMMARY = "MP3 encoding library"
DESCRIPTION = "Shine is an MP3 encoding library implemented in fixed-point \
arithmetic. The library can be used to perform MP3 encoding on \
architectures without a FPU, such as armel, etc., but likewise works \
on systems with an FPU."
LICENSE = "LGPL-2.0-only"

PV = "3.1.1"

RPM_NAME = "libshine3-3.1.1-1.7.aarch64.rpm"
RPM_HASH = "b37d0cea11ae16fb6fafd043767105fce6b0f27f181f64465fcffc97203c617ba822b3b0403d40d9a636b0b7f4e326d81bf2cde32c601e905f0027654100ecfd"

RPROVIDES:${PN} += "libshine.so.3 \
libshine3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
