SUMMARY = "Header files for developing C applications that use subunit"
DESCRIPTION = "Header files and libraries for developing C applications that use subunit."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "subunit-devel-1.4.2-3.2.aarch64.rpm"
RPM_HASH = "6b75e1b460cc16fe8f2b1c68970061c0358616e8b9b4bdb83b8d1db05c68ce4dba0136ba01fc56efa8b6ce71307a10502f6b6748734c8dfe938d3318c9ae243b"

RPROVIDES:${PN} += "pkgconfig-libsubunit \
subunit-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsubunit0 \
subunit"

inherit rpm
