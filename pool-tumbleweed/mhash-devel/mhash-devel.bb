SUMMARY = "Header Files for mhash Library"
DESCRIPTION = "The mhash library provides an easy way to access strong hashes such as \
MD5, SHA1, and other algorithms."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.9.9"

RPM_NAME = "mhash-devel-0.9.9.9-31.5.aarch64.rpm"
RPM_HASH = "0bfadf349c181ff5c3d10213ca63a12373ea3bdfc940acaa936d714f1ad9835fe3821f60d90c905f6b61fa8ac2074fc09d2d3bb876c986d3a42bc0090fbb2f65"

RPROVIDES:${PN} += "mhash-devel \
mhash-devel(aarch-64) \
mhash:/usr/include/mhash.h"

RDEPENDS:${PN} += "libmhash2"

inherit rpm
