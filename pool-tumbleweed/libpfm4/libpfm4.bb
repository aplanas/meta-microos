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

RPM_NAME = "libpfm4-4.13.0-1.3.aarch64.rpm"
RPM_HASH = "ace87704683bec3b9a0538adcb294aad31bf2e804e5256dcbb639d2e049f79ade6b31dd15abe6c2fb7ca8bc0b2151c99272616ec5bfcffa1fa5dda21e2cd8cdd"

RPROVIDES:${PN} += "libpfm.so.4 \
libpfm4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
