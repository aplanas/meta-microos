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

RPM_NAME = "crash-devel-8.0.3-1.4.aarch64.rpm"
RPM_HASH = "1cd6fc38f21918c009bc7ffe8994fa06b951e5a7abcc2a819a688e10df0b8efa1a388776d3e771b801685bb70f7c66c465ad8a411bf279e38a29809264b60c6e"

RPROVIDES:${PN} += "crash-devel"

RDEPENDS:${PN} += "crash \
zlib-devel"

inherit rpm
