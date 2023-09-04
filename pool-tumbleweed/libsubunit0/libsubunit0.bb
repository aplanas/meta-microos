SUMMARY = "Binary libraries for subunit"
DESCRIPTION = "Binary libraries for subunit"
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "1.4.2"

RPM_NAME = "libsubunit0-1.4.2-3.2.aarch64.rpm"
RPM_HASH = "dbd260d0a6167bcabf647cac47694593f2fd88d83afb12ccf70c6a31f780d84f5acd1c38afce398f94d4c5860d70aaf9abd65ce798c1b393951052c24812d769"

RPROVIDES:${PN} += "libsubunit.so.0 \
libsubunit0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
subunit"

inherit rpm
