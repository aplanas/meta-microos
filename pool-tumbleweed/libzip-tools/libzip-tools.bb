SUMMARY = "Utilities from the libzip project"
DESCRIPTION = "This subpackage contains zipcmp and zipmerge, for comparison of two \
archives, and merging multiple archives together, respectively."
LICENSE = "BSD-3-Clause"

PV = "1.9.2"

RPM_NAME = "libzip-tools-1.9.2-1.5.aarch64.rpm"
RPM_HASH = "e45b5d8eabbe3bc6b7dd66efc5592e736be3fcaaeca2af65f0a50397469c98b282558d448c9256c79ab760804258b2bb8254c8d14a6b98942cf9893ebd511b8f"

RPROVIDES:${PN} += "libzip \
libzip-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libz.so.1 \
libzip.so.5"

inherit rpm
