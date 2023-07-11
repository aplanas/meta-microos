SUMMARY = "Development files for jimtcl"
DESCRIPTION = "The jimtcl-devel package contains libraries and header files for \
developing applications that use jimtcl."
LICENSE = "BSD-2-Clause"

PV = "0.81"

RPM_NAME = "jimtcl-devel-0.81-1.4.aarch64.rpm"
RPM_HASH = "2ba668ac9fd2aae107177f45db9b92b8f0fc93e0167a8247e4514e8f7d59994ddd60471413220b8f4b35dd574fb6bcda5db40eb8aa21167e9b41639c593f7146"

RPROVIDES:${PN} += "jimtcl-devel \
pkgconfig-jimtcl"

RDEPENDS:${PN} += "/usr/bin/env \
/usr/bin/pkg-config \
jimtcl \
libjim0-81"

inherit rpm
