SUMMARY = "Container data types for Graphviz"
DESCRIPTION = "Library providing container data types for Graphviz."
LICENSE = "EPL-1.0"

PV = "2.49.3"

RPM_NAME = "libcdt5-2.49.3-6.4.aarch64.rpm"
RPM_HASH = "ba88a7f53318fee4c43fb36b51a912ac9faeb1ec59f0027a92f2491dce6e5ccac49d8aca8d947e806a08129e4fa76e67d13edae26da9822305afe75d3e17a178"

RPROVIDES:${PN} += "libcdt.so.5 \
libcdt5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
