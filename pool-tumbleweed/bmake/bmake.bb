SUMMARY = "The NetBSD make(1) tool"
DESCRIPTION = "bmake, the NetBSD make(1) tool, is a program designed to simplify the \
maintenance of other programs.  The input of bmake is a list of specifications \
indicating the files upon which the targets (programs and other files) depend. \
bmake then detects which targets are out of date based on their dependencies \
and triggers the necessary commands to bring them up to date when that happens. \
 \
bmake is similar to GNU make, even though the syntax for the advanced features \
supported in Makefiles is very different."
LICENSE = "BSD-2-Clause & BSD-3-Clause & BSD-4-Clause"

PV = "20230723"

RPM_NAME = "bmake-20230723-1.1.aarch64.rpm"
RPM_HASH = "961d529889df76b6411c0efd657d0c74334369f0ec4f58b3c8d0bda53393bb87daa13a336918f31c1a68e6d53c73288687bc2dcdb70421d3aed604516f91922d"

RPROVIDES:${PN} += "bmake"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
