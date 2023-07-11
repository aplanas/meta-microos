SUMMARY = "Development files for Unified Communication Services (UC-S)"
DESCRIPTION = "This framework provides infrastructure for component based \
programming, memory management, and system utilities."
LICENSE = "BSD-3-Clause"

PV = "1.14.0"

RPM_NAME = "libucs-devel-1.14.0-1.2.aarch64.rpm"
RPM_HASH = "da3bd35e5e42c60add91510ac07585657465a003092db47247eac7f8fb6ec04ac378dfa7a64009ad146051bb9327f46cefc4c5d097c3bca184c5e5f79221a191"

RPROVIDES:${PN} += "libucs-devel \
pkgconfig-ucx-ucs"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libucs0"

inherit rpm
