SUMMARY = "Files for Developing with libnumbertext"
DESCRIPTION = "Language-neutral NUMBERTEXT and MONEYTEXT functions for LibreOffice Calc \
 \
This package contains the libnumbertext development files."
LICENSE = "MPL-2.0"

PV = "1.0.11"

RPM_NAME = "libnumbertext-devel-1.0.11-1.4.aarch64.rpm"
RPM_HASH = "215de46448a467f5f3a2322e29f237651d763ec790d9a3bdff9e46e2bb542157c734ec7a1440282d31016d1206d89f7670ac14ac165113561c843b8af745d73f"

RPROVIDES:${PN} += "libnumbertext-devel \
pkgconfig-libnumbertext"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnumbertext-1-0-0"

inherit rpm
