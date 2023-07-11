SUMMARY = "Utility similar to 'time', but with repetitions and more statistics"
DESCRIPTION = "avgtime works like the 'time' command, except it accepts an '-r' \
argument to specify repetitions and shows more detailed statistics. \
 \
If repetitions are specified, then statistics are computed and shown, like \
median, mean, and standard deviation."
LICENSE = "BSL-1.0"

PV = "v0.5.0+4.ffdf200"

RPM_NAME = "avgtime-v0.5.0+4.ffdf200-4.2.aarch64.rpm"
RPM_HASH = "cda6af201ea68c1566a88cb186482c8a8927596fe2f68e04ee2e39ae9b2c2ad38013c160cbd7061a351c90e3d1dd2305a03661eac8b1134fc59894e32b6ec161"

RPROVIDES:${PN} += "avgtime"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
