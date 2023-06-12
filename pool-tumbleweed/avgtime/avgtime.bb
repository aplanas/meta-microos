SUMMARY = "Utility similar to 'time', but with repetitions and more statistics"
DESCRIPTION = "avgtime works like the 'time' command, except it accepts an '-r' \
argument to specify repetitions and shows more detailed statistics. \
 \
If repetitions are specified, then statistics are computed and shown, like \
median, mean, and standard deviation."
LICENSE = "BSL-1.0"

PV = "v0.5.0+4.ffdf200"

RPM_NAME = "avgtime-v0.5.0+4.ffdf200-4.1.aarch64.rpm"
RPM_HASH = "ee59153c193a0395b4cc008c7c97bd27d94c16f71538e518267c8c948f1f88654940b5d1851dcf76ab0cd7e311201d1acb75c05c1ae2155c689873eafbf679bd"

RPROVIDES:${PN} += "avgtime \
avgtime(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3)(64bit) \
libgcc_s.so.1(GCC_4.2.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit)"

inherit rpm
