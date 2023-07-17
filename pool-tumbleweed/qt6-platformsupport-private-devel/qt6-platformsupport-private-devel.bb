SUMMARY = "Non-ABI stable API for the  Qt6 PlatformSupport library"
DESCRIPTION = "This package provides private headers of libQt6PlatformSupport that do not have \
any ABI or API guarantees."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "qt6-platformsupport-private-devel-6.5.1-4.1.aarch64.rpm"
RPM_HASH = "48abbc1ddbe4ae6778f3be539373e35b71cf1ad7d525aa32ffacda20444b936fc0be8ec174095734b3700e13ae2ed0deb86720f99a889138a1b532e09ded18ad"

RPROVIDES:${PN} += "qt6-platformsupport-private-devel"

RDEPENDS:${PN} += "qt6-platformsupport-devel-static"

inherit rpm
