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

RPM_NAME = "crash-devel-8.0.3-2.2.aarch64.rpm"
RPM_HASH = "9a45e82b2941421f44263e5e22846aca03c99aa170c9a303657cf7f6d2777f166695e0fae5f3464083abc1383dca6e2e4da2e4dca4a368287c45de97a8143090"

RPROVIDES:${PN} += "crash-devel"

RDEPENDS:${PN} += "crash \
zlib-devel"

inherit rpm
