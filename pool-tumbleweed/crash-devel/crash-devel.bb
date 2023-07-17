SUMMARY = "Development files for crash"
DESCRIPTION = "This files are required to build extensions for crash. \
 \
Crash is the core analysis suite that can be used to investigate either \
live systems, kernel core dumps created from the netdump and diskdump \
packages from Red Hat Linux, the mcore kernel patch offered by Mission \
Critical Linux, or the LKCD kernel patch. \
 \
 \
 \
Authors: \
-------- \
    David Anderson <anderson@redhat.com>"
LICENSE = "GPL-2.0-or-later"

PV = "8.0.3"

RPM_NAME = "crash-devel-8.0.3-1.10.aarch64.rpm"
RPM_HASH = "8a903c0b993096a56475f4a98d3bafbf75e1adc6f5f4beaef7e5b7fbca27982cafe4d2a1cbc28d16779d0b31db33b2da2f6b29bdccd3292338bc3aace79c81e3"

RPROVIDES:${PN} += "crash-devel"

RDEPENDS:${PN} += "crash \
zlib-devel"

inherit rpm
