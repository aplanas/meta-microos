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

RPM_NAME = "crash-devel-8.0.3-1.13.aarch64.rpm"
RPM_HASH = "56cb1354ff832ab9f0e07a199852371b538fbb9b120dad00bce45e1ea06cdb5b5cd4a9082f21ab1edf25ec465148c988f5c576f2715b22452f983fbeb585be70"

RPROVIDES:${PN} += "crash-devel"

RDEPENDS:${PN} += "crash \
zlib-devel"

inherit rpm
