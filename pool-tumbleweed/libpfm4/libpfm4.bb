SUMMARY = "Runtime library to encode performance events for use by perf tool"
DESCRIPTION = "This package provides a library that can be used to encode events into the \
format required by the operating systems performance monitoring subsystem. \
The library does not make any performance monitoring system calls, it simply \
provides a method to convert an event name, expressed as a string, to an event \
encoding. The user of the library may use this event encoding in a subsequent \
system call. \
 \
The current libpfm4 provides support for the perf_events interface which was \
introduced in Linux v2.6.31."
LICENSE = "MIT"

PV = "4.13.0"

RPM_NAME = "libpfm4-4.13.0-1.1.aarch64.rpm"
RPM_HASH = "091fae83ca74692b7676772c04da4aef9984214d9b4b3c146d6f109c7d478ede8323d60db7a4a6e07790f9aaef6af18853bdcb66e6812b0728da0b81e18c69ac"

RPROVIDES:${PN} += "libpfm.so.4()(64bit) \
libpfm4 \
libpfm4(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
